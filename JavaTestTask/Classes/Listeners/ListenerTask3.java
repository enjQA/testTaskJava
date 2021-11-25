import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ListenerTask3 implements ITestListener{

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        TakesScreenshot ts = (TakesScreenshot)TestTask3.driver;
        File file = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, new File("Success"+Long.toHexString(Double.doubleToLongBits(Math.random()))+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("screenshot is taken");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        TakesScreenshot ts = (TakesScreenshot)TestTask3.driver;
        File file = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, new File("Fail"+result.getName()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("screenshot is taken");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

}