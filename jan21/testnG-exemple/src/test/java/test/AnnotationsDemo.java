package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {




    @BeforeSuite
    public void setupSuite(){
        System.out.println("Set up suite");
    }
    @AfterSuite
    public void tearDown(){
        System.out.println("Close suite");
    }

    @BeforeTest




    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @Test
    public void test4(){
        System.out.println("test4");
    }
}
