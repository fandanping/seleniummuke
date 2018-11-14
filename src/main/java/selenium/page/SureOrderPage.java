package selenium.page;

import org.openqa.selenium.WebElement;
import selenium.Utils.GetByLocator;
import selenium.base.DriverBase;

import java.lang.management.GarbageCollectorMXBean;

public class SureOrderPage extends BasePages{

    public SureOrderPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取提交订单按钮
     */
    public WebElement getSureOrderButton(){
        return element(GetByLocator.getLocator("sureOrder"));
    }

}
