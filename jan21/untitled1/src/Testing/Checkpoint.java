package Testing;

public class Checkpoint {
    class A{
        public A(){
            System.out.println("A's no-arg constructor is invoked");
        }
        class B extends A{
            public B(){
                System.out.println("B's no-arg constructor is invoked");
            }
            public class C{
                public void main(String[] args) {
                    B b = new B();
                }
                
            }
        }
    }
}
