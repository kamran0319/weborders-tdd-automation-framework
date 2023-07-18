package zmisc;

public class DogTest {

    public static void main(String[] args) {
        Dog dog = new Dog("dlkgjdlk",55);
        System.out.println(dog.getAge());
        dog.setAge(45);
        System.out.println(dog.getAge());
        System.out.println(dog);
    }


}
