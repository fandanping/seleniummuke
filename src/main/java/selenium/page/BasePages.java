package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.base.DriverBase;

/**
 * 页面基类
 */
public class BasePages {
    //把DriverBase中封装好的driver拿过来
    public DriverBase driver;
    //构造方法
    public BasePages(DriverBase driver){
        //把初始化传入的DriverBase赋值给当前BasePage类的DriverBase的变量
        this.driver=driver;
    }

    /*
     * 定位Element
     * @param By by
     *
     * */
    public WebElement element(By by) {
        WebElement ele=driver.findElement(by);
        return ele;
    }
    /*
   * 封装click（点击）方法
   * 需要传入一个WebElement类型的元素
   *
   * */
    public void click(WebElement element) {
        if(element!=null) {
            element.click();
        }else {
            System.out.println("元素未定位到,定位失败");
        }
    }
    /*
   * 封装输入方法
   *
   * */
    public void sendKeys(WebElement element,String value) {
        if(element!=null) {
            element.sendKeys(value);
        }else {
            System.out.println(element+"元素没有定位到,输入失败"+value);
        }
    }
    /*
       * 判断元素是否显示方法
       *
       * */
    public boolean assertElementIs(WebElement element) {
        return element.isDisplayed();
    }


}
