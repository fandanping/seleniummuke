package selenium.business;

import org.openqa.selenium.JavascriptExecutor;
import selenium.base.DriverBase;
import selenium.handle.CoursePageHandle;

import java.util.List;

public class CoursePagePro {
    public DriverBase driver;

    public CoursePageHandle coursePageHandle;
    public CoursePagePro(DriverBase driver){
        this.driver=driver;
        coursePageHandle=new CoursePageHandle(driver);
    }
    /**
     * 添加购物车
     */
    public void addCar(){
        int beforeNum;
        int afterNum;
        String aftercourseNum;
        String courseNum=coursePageHandle.getShopCartNum();
        try{
            beforeNum = Integer.valueOf(courseNum);
            System.out.println("beforeNum:"+beforeNum);
        }catch(Exception e){
            beforeNum=0;
        }
        //点击加入购物车
        coursePageHandle.clickAddCart();
        try {
            //转接模态框
            driver.switchToMode();
            //点击“确定”按钮
            coursePageHandle.clickReadBuy();
        }catch(Exception e){

        }
        aftercourseNum=coursePageHandle.getShopCartNum();
        try{
            afterNum=Integer.valueOf(aftercourseNum);
            System.out.println("afterNum:"+afterNum);
        }catch(Exception e){
            afterNum=beforeNum;
        }
        driver.sleep(2000);
        if(afterNum == beforeNum+1){
            System.out.println("添加购物车成功");
            //点击右上角的购物车按钮
            coursePageHandle.clickShopCart();
            driver.sleep(5000);
            List<String> list=driver.getWindowsHandles();
            driver.switchWindows(list.get(1));
            System.out.println(driver.getTitle());
            //点击去结算按钮
             coursePageHandle.clickGoPay();
        }/*else if(afterNum>0){
            coursePageHandle.clickShopCart();
            driver.sleep(5000);
            //点击去结算按钮
            //coursePageHandle.clickGoPay();
            coursePageHandle.GoPayDisplay();
            System.out.println("结算按钮是否显示："+  coursePageHandle.GoPayDisplay());
            if(coursePageHandle.GoPayDisplay()){
                System.out.println("结算按钮显示了，进行点击："+  coursePageHandle.GoPayDisplay());
                coursePageHandle.clickGoPay();
            }
        }*/else {
            //点击右上角的购物车按钮
            coursePageHandle.clickShopCart();
            driver.sleep(5000);
            List<String> list=driver.getWindowsHandles();
            driver.switchWindows(list.get(1));
            System.out.println(driver.getTitle());
            coursePageHandle.clickGoPay();
        }

    }
    /**
     * 点击立即购买按钮
     */

    public void buyNow(){
        coursePageHandle.clickBuyNew();
    }


}
