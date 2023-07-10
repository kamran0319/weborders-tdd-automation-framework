package Inheritance;

public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(double weigth, double height, int age, String breed) {
        super(weigth, height, age);
        this.breed = breed;
    }

    public Dog(){

    }
    public void bark(){
        System.out.println("Dog is barking.");
    }
    public void printAge(){
        System.out.println(getAge());
    }

}
