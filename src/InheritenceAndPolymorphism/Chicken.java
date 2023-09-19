package InheritenceAndPolymorphism;

public class Chicken extends Bird{
    public Chicken(int Age, char Gender, int WeightInPounds) {
        super(Age, Gender, WeightInPounds);
    }
    public void fly(){
        System.out.println("I am a Chicken and I cannot fly....");
    }
}
