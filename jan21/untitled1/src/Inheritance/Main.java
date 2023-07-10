package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Animal animal=new Animal();
//        System.out.println(animal.getAge());

//        Dog dog=new Dog(3.5,2.2,6,"Lab");
//
//        System.out.println(dog.getAge());
//        dog.eat();
//        dog.bark();
//
       Shiba shiba=new Shiba(5.3,4.9,8,"Blue",true);
       shiba.beUsedAmeme();
        System.out.println(shiba.isAmeme);
        shiba.bark();
        shiba.eat();
        shiba.printAge();
        System.out.println(shiba.getAge());

    }
}
