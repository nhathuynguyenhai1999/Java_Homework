package DesignPattern;

public class FactoryMethod {
    abstract static class Animal {
        public abstract String makeSound();
    }
    static class Dog extends Animal {
        @Override
        public String makeSound() {
            return "Woof";
        }
    }
    static class Cat extends Animal {
        @Override
        public String makeSound() {
            return "Meow";
        }
    }
    static class AnimalFactory {
        public Animal getAnimal(String type){
            if("canine".equals(type)){
                return new Dog();
            }
            else {
                return new Cat();
            }
        }
    }
    // Shape interface
    interface Shape {
        void draw();
    }

    // Circle class
    class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    // Rectangle class
    class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    // Square class
    class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Square");
        }
    }

    // Shape Factory interface
    interface ShapeFactory {
        Shape createShape();
    }

    // Circle Factory
    class CircleFactory implements ShapeFactory {
        @Override
        public Shape createShape() {
            return new Circle();
        }
    }
    // Rectangle Factory
    class RectangleFactory implements ShapeFactory {
        @Override
        public Shape createShape() {
            return new Rectangle();
        }
    }
    // Square Factory
    class SquareFactory implements ShapeFactory {
        @Override
        public Shape createShape() {
            return new Square();
        }
    }
    static class FactoryDemo {
        public void main1(String[] args) {
            AnimalFactory animalFactory = new AnimalFactory();
            Animal a1 = animalFactory.getAnimal("feline");
            System.out.println("a1 sound" + a1.makeSound());
            Animal a2 = animalFactory.getAnimal("canine");
            System.out.println("a2 sound" + a2.makeSound());
        }
    }
    public static void main(String[] args) {
        FactoryDemo factoryDemo = new FactoryDemo();
        factoryDemo.main1(args);
    }
    // Main class
    public class FactoryMethodExample {
        public void main1(String[] args) {
            // Create a circle using the CircleFactory
            ShapeFactory circleFactory = new CircleFactory();
            Shape circle = circleFactory.createShape();
            circle.draw();
            // Create a rectangle using the RectangleFactory
            ShapeFactory rectangleFactory = new RectangleFactory();
            Shape rectangle = rectangleFactory.createShape();
            rectangle.draw();
            // Create a square using the SquareFactory
            ShapeFactory squareFactory = new SquareFactory();
            Shape square = squareFactory.createShape();
            square.draw();

        }
    }
}
