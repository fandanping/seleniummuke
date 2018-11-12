package selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 浏览器的基类
 */
public class DriverBase {
   public  WebDriver driver;
    //构造方法
   public DriverBase(String browser){
       //初始化浏览器选择类
        SelectDriver selectDriver=new SelectDriver();
       //把确定之后的浏览器实例赋值给当前的Webdriver
       selectDriver.driverName(browser);
   }
    //关闭浏览器驱动方法
   public void stop(){
       System.out.println("Stop Driver!");
       driver.close();
   }

    /*
     * 封装Element方法
     *
     * */
    public WebElement findElement(By by) {
        WebElement element=driver.findElement(by);
        return element;
    }



}
