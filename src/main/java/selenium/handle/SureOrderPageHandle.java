package selenium.handle;

import selenium.base.DriverBase;
import selenium.page.SureOrderPage;

public class SureOrderPageHandle {
    public DriverBase driverBase;
    public SureOrderPage sureOrderPage;
    public SureOrderPageHandle(DriverBase driverBase){
        this.driverBase=driverBase;
        sureOrderPage=new SureOrderPage(driverBase);
    }
    /**
     * 点击提交订单按钮
     */
    public void clickSureOrderButton(){
        sureOrderPage.click(sureOrderPage.getSureOrderButton());
    }

}
