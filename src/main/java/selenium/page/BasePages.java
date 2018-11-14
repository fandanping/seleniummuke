package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import selenium.base.DriverBase;

import java.util.List;

/**
 * 页面基类:对页面元素基本操作进行封装，简化操作
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

    /**
     * 层级定位 通过父节点定位到子节点
     * 需要传入父节点,子节点的by
     */
     public WebElement nodeElement(By by,By nodeBy){
         WebElement el=this.element(by).findElement(nodeBy);
         return el;
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
    /**
     * 获取文本信息
     */
     public String getText(WebElement element){
         try {
             return element.getText();
         }catch(NoSuchElementException e){
             return "Text not existed!";
         }
     }
    /**
     * 判断元素是否存在
     */
    public boolean isWebElementExist(By by){
         try{
              element(by);
              return true;
         }catch(NoSuchElementException e){
             return  false;
         }
    }
    /**
     * 元素包含指定文本，进行点击
     */
    public void clickElementContainingText(By by ,String text){
        List<WebElement> elementList=driver.findElements(by);
        for(WebElement e:elementList){
             if(e.getText().contains(text)){
                  e.click();
                  break;
             }
        }
    }
    /**
     * 返回链接包含指定文档的href
     */
     public String getLinkUrlContainingText(By by,String text){
         List<WebElement>subscribeButton = driver.findElements(by);
         String url = null;
         for(WebElement e:subscribeButton){
             if(e.getText().contains(text)){
                 url =e.getAttribute("href");
                 break;
             }
         }
         return url;
     }
}
