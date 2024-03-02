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
}
