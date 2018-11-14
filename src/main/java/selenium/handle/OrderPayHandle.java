package selenium.handle;

import selenium.base.DriverBase;
import selenium.page.OrderPayPage;

public class OrderPayHandle {
    public DriverBase driverBase;
    public OrderPayPage orderPayPage;
    public OrderPayHandle(DriverBase driverBase){
        this.driverBase=driverBase;
        orderPayPage=new OrderPayPage(driverBase);
    }
    /**
     * 获取订单文字
     */
    public String getOrderName(){
         return orderPayPage.getText(orderPayPage.getOrderNumElement());
    }
    /**
     * 获得课程名称
     */
    public String getOrderCourseName(){
        return orderPayPage.getText(orderPayPage.getOrderCourseNameElement());
    }
    /**
     * 点击支付宝支付
     */
    public void clickAliPay(){
        orderPayPage.click(orderPayPage.getAlilPayElement());
    }
    /**
     * 点击立即支付
     */
    public void clickPayElement(){
        orderPayPage.click(orderPayPage.getOrderPayElement());
    }

}
