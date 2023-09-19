package InheritenceAndPolymorphism;

public class Fish extends Animal{
    public Fish(int Age, char Gender, int WeightInPounds) {
        super(Age, Gender, WeightInPounds);
    }
    public void swim(){
        System.out.println("I am a Fish and I swimming....");
    }
}

