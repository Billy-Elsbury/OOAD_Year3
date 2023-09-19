package InheritenceAndPolymorphism;

public class Animal {
    int age;
    char gender;
    int weightInPounds;
    public Animal(int Age, char Gender, int WeightInPounds){
        age = Age;
        gender = Gender;
        weightInPounds=WeightInPounds;
    }
    public void eat(){
        System.out.println(("I am an Animal and I am eating...."));
    }
    public void sleep(){
        System.out.println(("I am an Animal and I am sleeping...."));
    }

}
