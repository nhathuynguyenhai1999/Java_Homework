package StructuralDesignPattern;

public class ProxyPattern {
    public interface Calculator {
        double add (double first, double second);
        double sub (double first , double second);
        double mul (double first, double second);
        double div (double first, double second);
    }
    static class MatchCalculator implements Calculator {

        @Override
        public double add(double first, double second) {
            return first + second;
        }

        @Override
        public double sub(double first, double second) {
            return first - second;
        }

        @Override
        public double mul(double first, double second) {
            return first * second;
        }

        @Override
        public double div(double first, double second) {
            return first / second;
        }
    }
    static class MatchCalculatorProxy implements Calculator {
        private final MatchCalculator mathCalculator;

        public MatchCalculatorProxy(){
            this.mathCalculator = new MatchCalculator();
        }

        @Override
        public double add(double first, double second) {
            if(first / 2 + second / 2 >= Double.MAX_VALUE / 2){
                throw new RuntimeException("Out of range");
            }
            if(first / 2 + second / 2 <= Double.MIN_VALUE / 2){
                throw new RuntimeException("Out of range");
            }
            return mathCalculator.add(first, second);
        }

        @Override
        public double sub(double first, double second) {
            if(first / 2 - second / 2 >= Double.MAX_VALUE / 2){
                throw new RuntimeException("Out of range");
            }
            if(first / 2 - second / 2 <= Double.MIN_VALUE / 2){
                throw new RuntimeException("Out of range");
            }
            return mathCalculator.sub(first, second);
        }

        @Override
        public double mul(double first, double second) {
            double result = mathCalculator.mul(first, second);
            if(first != 0 && result / first != second){
                throw new RuntimeException("Out of range");
            }
            return result;
        }

        @Override
        public double div(double first, double second) {
            if(second == 0){
                throw new RuntimeException("Can't divide by zero");
            }
            return mathCalculator.div(first, second);
        }
    }
    static class Main {
        public static void main(String[] args) {
            MatchCalculatorProxy proxy = new MatchCalculatorProxy();
            double result = proxy.add(1,2);
            System.out.println("1 + 2 = " + result);
            result = proxy.add(2,Double.MAX_VALUE);
            System.out.println("2 + Double.MAX_VALUE = " + result);//Should throw exception
        }
    }
}