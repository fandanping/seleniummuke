package selenium;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import selenium.BaseDriver;
public class TestngListenerScreenShot  extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
    }
    //ITestResult：运行当前case对象
    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        try {
            takeScreenShot(tr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void takeScreenShot(ITestResult tr) throws Exception {
        BaseDriver b=(BaseDriver) tr.getInstance();
        b.takeScreenShot01();
    }
    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
    }
    @Override
    public void onStart(ITestContext testContext) {
        super.onStart(testContext);
    }
    @Override
    public void onTestStart(ITestResult result) {
        super.onTestStart(result);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        super.onFinish(testContext);
    }



}
