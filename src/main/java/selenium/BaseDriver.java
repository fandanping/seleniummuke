package selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.Utils.FileUtils;

import java.io.File;

public class BaseDriver {
    public WebDriver driver;
    public BaseDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fandanping\\Desktop\\学习\\安装包\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    /**
     * 截图
     */
    public void takeScreenShot01() throws Exception {
        long date = System.currentTimeMillis();
        String path = String.valueOf(date);
        //获取系统当前路径
        String curPath=System.getProperty("user.dir");
        path=path + ".png";
        String screenPath= curPath+"/"+path;
        File screen=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen,new File(screenPath));
    }
}
