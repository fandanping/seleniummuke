package selenium.page;

import org.openqa.selenium.WebElement;
import selenium.Utils.GetByLocator;
import selenium.base.DriverBase;

public class OrderPayPage extends BasePages {

    public OrderPayPage(DriverBase driver) {
        super(driver);
    }
    /**
     * 获取订单号element
     */
    public WebElement getOrderNumElement(){
        return  element(GetByLocator.getLocator("orderNum"));
    }
    /**
     * 返回课程名称element
     */
     public WebElement getOrderCourseNameElement(){
         return nodeElement(GetByLocator.getLocator("orderCourse"),GetByLocator.getLocator("orderCourseNode"));
     }
    /**
     * 返回支付宝element
     */
    public WebElement getAlilPayElement(){
        return element(GetByLocator.getLocator("alipay"));
    }
    /**
     * 获得立即支付element
     */
    public WebElement getOrderPayElement(){
        return element(GetByLocator.getLocator("orderPay"));
    }

}
