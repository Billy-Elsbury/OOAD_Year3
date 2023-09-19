package InheritenceAndPolymorphism;

public class Zoo_Driver {
    public static void main(String[] args) {
        Animal animal1 = new Animal(2,'F',120);
        animal1.eat();
        animal1.sleep();
        animal1.eat();

        Bird bird1 = new Bird(3,'M',2);
        bird1.sleep();
        bird1.fly();

        Fish fish1 = new Fish(2,'F',3);
        fish1.swim();
        fish1.sleep();

        Chicken chicken1 = new Chicken(3,'F',2);
        chicken1.fly();
    }
}

