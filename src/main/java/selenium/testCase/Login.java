package selenium.testCase;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.DriverBase;
import selenium.business.CoursePagePro;
import selenium.business.LoginPro;
import selenium.business.OrderPayPro;
import selenium.business.SureOrderPro;


public class Login  extends  CaseBase{
    //使用静态声明主要是为了在第一次进来的时候就调用生成，并且有且仅有一次
    static Logger logger= Logger.getLogger(Login.class);
    public DriverBase driverBase;
    public LoginPro loginPro;
    public CoursePagePro coursePagePro;
    public SureOrderPro sureOrderPro;
    public OrderPayPro orderPayPro;
    public Login(){
        this.driverBase=InitDriverBase("firefox");
        loginPro=new LoginPro(driverBase);
        coursePagePro=new CoursePagePro(driverBase);
        sureOrderPro=new SureOrderPro(driverBase);
        orderPayPro=new OrderPayPro(driverBase);
    }
  /*  @Test
    public void getLoginHome() {
        driverBase.get("http://www.imooc.com");
        driverBase.getWindowMax();
        driverBase.findElement(By.id("js-signin-btn")).click();
        //driverBase.findElement(GetByLocator.getLocator("loginButton")).click();
        driverBase.sleep(2000);
    }*/
   // @Test(dependsOnMethods ={"getLoginHome"} )
    @Test
    public void testLogin(){
        logger.log(Level.DEBUG,"打印信息");
        driverBase.get("http://www.imooc.com");
        driverBase.getWindowMax();
        driverBase.findElement(By.id("js-signin-btn")).click();
        //driverBase.findElement(GetByLocator.getLocator("loginButton")).click();
        driverBase.sleep(5000);
        loginPro.login("18602474229","fandanping521");
        driverBase.sleep(2000);
        driverBase.get("http://coding.imooc.com/class/136.html");
        //点击添加购物车 去结算
        coursePagePro.addCar();
        //点击提交订单
        sureOrderPro.sureOrder();
        //支付中心 立即支付
        orderPayPro.orderPayPro();
    }
    /**
     * 添加购物车
     */
 /*   @Test
    public void  testAddCart(){
        coursePagePro.addCar();
    }*/









    /**
     * 获取课程信息
     * @param element
     * @return
     */
   /* public String getCourseText(WebElement element){
              return element.getText();
    }*/
    /**
     * 下单流程
     */
   /* @Test(dependsOnMethods = {"testLogin"})
    public void buyCourse(){
        driverBase.get("http://coding.imooc.com/class/136.html");
        String courseDetail=driverBase.findElement(By.className("path")).findElement(By.tagName("span")).getText();
        //点击立即购买
        driverBase.findElement(By.id("buy-trigger")).click();
        driverBase.sleep(5000);
        driverBase.findElement(By.linkText("提交订单")).click();
        //
        String orderText=driverBase.findElement(By.className("order")).getText();
        if(orderText!=null){
           String orderString= driverBase.findElement(By.className("left")).findElement(By.tagName("dt")).getText();
            Assert.assertEquals(courseDetail,orderString,"购买的商品信息不一样");

        }
    }*/

}
