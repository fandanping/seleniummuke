package selenium.business;

import selenium.base.DriverBase;
import selenium.handle.SureOrderPageHandle;

public class SureOrderPro {
    public SureOrderPageHandle sureOrderPageHandle;
    public DriverBase driverBase;

    public SureOrderPro(DriverBase driverBase){
        this.driverBase=driverBase;
        sureOrderPageHandle=new SureOrderPageHandle(driverBase);
    }
    /**
     * 点击提交订单按钮
     */
    public void sureOrder(){
        sureOrderPageHandle.clickSureOrderButton();
    }
}
