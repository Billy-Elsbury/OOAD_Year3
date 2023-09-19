package InheritenceAndPolymorphism;

public class Bird extends Animal{
    public Bird(int Age, char Gender, int WeightInPounds) {
        super(Age, Gender, WeightInPounds);
    }
    public void fly(){
        System.out.println("I am Bird and I am flying....");
    }
}
