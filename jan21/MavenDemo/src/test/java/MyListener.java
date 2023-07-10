import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("This is start");
    }


    public void onTestSuccess(ITestResult result) {
        System.out.println("This is success");
    }


    public void onTestFailure(ITestResult result) {
        System.out.println("This is failure");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("This is result");
    }



    public void onStart(ITestContext context) {
        System.out.println("This is onStart");
    }


    public void onFinish(ITestContext context) {
        System.out.println("This is onFinish");
    }
}



