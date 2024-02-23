package Threading;

import java.util.Random;

public class Car implements Runnable {
    private static final double DISTANCE = 100;
    private static final int STEP = 2;
    private final String name;
    public Car(String name){
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE){
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                StringBuilder log = getStringBuilder(runDistance);
                System.out.println("Car" + this.name + ":" + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("Car" + this.name + "broken....");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }

    private static StringBuilder getStringBuilder(int runDistance) {
        StringBuilder log = new StringBuilder("|");
        int percentTravel = (int) ((runDistance * 100)/ DISTANCE);
        for (int i = 0; i < DISTANCE; i+= STEP) {
            if (percentTravel >= i + STEP){
                log.append("=");
            }
            else if (percentTravel >= i && percentTravel < i + STEP) {
                log.append("o");
            }
            else {
                log.append("-");
            }
        }
        log.append("|");
        return log;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Công");
        Car car2 = new Car("Duyên");
        Car car3 = new Car("Toàn");
        Thread thread = new Thread(car1);
        Thread thread1 = new Thread(car2);
        Thread thread2 = new Thread(car3);
        System.out.println("Distance: 1000KM");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
