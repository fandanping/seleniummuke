package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import selenium.Utils.ProUtil;

import java.util.*;

@Listeners({TestngListenerScreenShot.class})
public class Login  extends  BaseDriver{

    /**
     * 初始化driver
     */
  /*  public void InitDriver(){
        String url="https://www.imooc.com/";
     //   System.setProperty("webdriver.chrome.driver","C:\\Users\\fandanping\\Desktop\\学习\\安装包\\chromedriver.exe");
      //  driver = new ChromeDriver();
        driver.get(url);
        //最大化
        driver.manage().window().maximize();
        //点击登录按钮
        driver.findElement(By.id("js-signin-btn")).click();
    }*/
    /**
     * 登录脚本
     */
    public void loginScript(String username,String pwd) throws Exception {
        //调用driver
      //  this.InitDriver();
        String url="https://www.imooc.com/";
        driver.get(url);
        //最大化
        driver.manage().window().maximize();
        //点击登录按钮
        driver.findElement(By.id("js-signin-btn")).click();
        Thread.sleep(3000);
        WebElement user=this.element(this.byStr("username"));
        user.isDisplayed();//是否显示
        WebElement password=this.element(this.byStr("userpass"));
        password.isDisplayed();
        WebElement logonBtn=this.element(this.byStr("loginbutton"));
        logonBtn.isDisplayed();
        user.sendKeys(username);
        password.sendKeys(pwd);
        logonBtn.click();
        Thread.sleep(3000);
        //在首页获取id为header-avator的状态
        WebElement header=this.element(this.byStr("header"));
        header.isDisplayed();
        //悬浮
        Actions actions=new Actions(driver);
        actions.moveToElement(header).perform();
        //检验用户名
        String userInfo=this.element(this.byStr("nameInfo")).getText();
        System.out.println(userInfo);
        if(userInfo.equals("weixin_99丹_0")){
            //登录成功截图
            //this.takeScreenShot01();
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
        //关闭浏览器
        driver.close();
    }
    /**
     * 封装by
     * @return
     */
    public By byStr(String  key){
        ProUtil properties =new ProUtil("/element.properties");
        String locator=properties.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue= locator.split(">")[1];
        if(locatorType.equals("id")){
            return By.id(locatorValue);
        }else if(locatorType.equals("name")){
            return By.name(locatorValue);
        }else if(locatorType.equals("className")){
            return By.className(locatorValue);
        }else {
            return By.xpath(locatorValue);
        }
    }
    /**
     * 封装element
     */
    public  WebElement element(By by){
        WebElement ele=driver.findElement(by);
        return ele;
    }


    @Test
     public void loginPagr() throws InterruptedException {
        Login login=new Login();
        /**
         * 登录账号参数化
         */
        Map<String,String> map=new HashMap<String,String>();
        map.put("18602474229","fandanping521");
       // map.put("18602474229@163.com","fandanping521");
        Iterator iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry= (Map.Entry) iterator.next();
            String username=entry.getKey();
            String password =entry.getValue();
            try {
                login.loginScript(username,password);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
   /* public static void main(String[] args) throws InterruptedException {
        Login login=new Login();
        *//**
         * 登录账号参数化
         *//*
       // login.loginScript("18602474229","fandanping521");
        Map<String,String> map=new HashMap<String,String>();
        map.put("18602474229","fandanping521");
        map.put("18602474229@163.com","fandanping521");
        Iterator iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry= (Map.Entry) iterator.next();
            String username=entry.getKey();
            String password =entry.getValue();
            login.loginScript(username,password);
        }

    }
*/
}
