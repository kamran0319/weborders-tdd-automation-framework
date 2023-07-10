package Inheritance;

public class Animal {
    private double weigth;
    private double height;
    private int age=35;

    public Animal(double weigth, double height, int age) {
        this.weigth = weigth;
        this.height = height;
        this.age = age;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {}
    public void eat(){
        System.out.println("Complex eat logic");

    }

}


