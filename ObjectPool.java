package DesignPattern.com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ObjectPool {
    static class Taxi {
        private String name;

        public Taxi(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        @Override
        public String toString(){
            return "Taxi{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class TaxiPool {
        private static final long EXPIRED_TIME_IN_MILISECOND = 1200;
        private static final int NUMBER_OF_TAXI = 4;
        private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
        private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<>());
        private final AtomicInteger count = new AtomicInteger(0);
        private final AtomicBoolean waiting = new AtomicBoolean(false);

        public synchronized void release(Taxi taxi){
            inUse.remove(taxi);
            available.add(taxi);
            System.out.println(taxi.getName() + " is free");
        }

        public synchronized Taxi getTaxi(){
            if(!available.isEmpty()){
                Taxi taxi = available.get(0);
                inUse.add(taxi);
                return taxi;
            }

            if(count.get()==NUMBER_OF_TAXI){
                this.waitUntilTaxiAvailable();
                return this.getTaxi();
            }

            Taxi taxi = this.createTaxi();
            inUse.add(taxi);
            return taxi;
        }

        private Taxi createTaxi() {
            waiting(200);
            Taxi taxi = new Taxi("Taxi" + count.incrementAndGet());
            System.out.println(taxi.getName() + " is created");
            return taxi;
        }

        private void waiting(long time) {
            try {
                TimeUnit.MICROSECONDS.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }

        private void waitUntilTaxiAvailable() {
            if (waiting.get()) {
                waiting.set(false);
                throw new TaxiNotFoundException("No taxi available");
            }
            waiting.set(true);
            waiting(EXPIRED_TIME_IN_MILISECOND);
        }
    }

    static class TaxiThread implements Runnable {
        private final TaxiPool taxiPool;

        public TaxiThread(TaxiPool taxiPool) {
            this.taxiPool = taxiPool;
        }

        @Override
        public void run() {
            takeATaxi();
        }

        private void takeATaxi() {
            try {
                System.out.println("New Client: " + Thread.currentThread().getName());
                Taxi taxi = taxiPool.getTaxi();
                TimeUnit.MICROSECONDS.sleep(randInt());
                taxiPool.release(taxi);
                System.out.println("Served the client: " + Thread.currentThread().getName());
            } catch (InterruptedException | TaxiNotFoundException e) {
                System.out.println(">>> Rejected the client: " + Thread.currentThread().getName());
            }
        }

        private int randInt() {
            return new Random().nextInt((1500 - 1000) + 1) + 1000;
        }
    }

    static class ObjectPoolDemo {
        public static final int NUM_OF_CLIENT = 8;

        public static void main(String[] args) {
            TaxiPool taxiPool = new TaxiPool();
            for (int i = 1; i <= NUM_OF_CLIENT; i++) {
                Runnable client = new TaxiThread(taxiPool);
                Thread thread = new Thread(client);
                thread.start();
            }
        }
    }
    static class TaxiNotFoundException extends RuntimeException {
        public TaxiNotFoundException(String message) {
            super(message);
        }
    }
}
