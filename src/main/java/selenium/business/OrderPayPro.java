package selenium.business;

import selenium.base.DriverBase;
import selenium.handle.OrderPayHandle;

public class OrderPayPro {
    public DriverBase driverBase;
    public OrderPayHandle orderPayHandle;

    public OrderPayPro( DriverBase driverBase){
        this.driverBase=driverBase;
        this.orderPayHandle=new OrderPayHandle(driverBase);
    }

    /**
     * 根据课程信息与订单是否正确判断是否跳转到支付页面
     */
    public void orderPayPro(){
        String orderName=orderPayHandle.getOrderName();
        String orderCoueseName=orderPayHandle.getOrderCourseName();
        if(orderName !=null && orderCoueseName !=null){
           //选中支付宝支付
           orderPayHandle.clickAliPay();
           //点击立即支付
            orderPayHandle.clickPayElement();
        }
    }
}
