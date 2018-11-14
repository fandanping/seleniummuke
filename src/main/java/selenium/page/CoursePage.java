package selenium.page;

import org.openqa.selenium.WebElement;
import selenium.Utils.GetByLocator;
import selenium.base.DriverBase;

public class CoursePage extends BasePages {

    public CoursePage(DriverBase driver) {
        super(driver);
    }
    /**
     * 获取立即购买按钮element
     */
    public WebElement getBuytriggerElement(){
        return element(GetByLocator.getLocator("buyNow"));
    }
    /**
     * 获取添加购物车element
     */
    public WebElement getAddCartElement(){
        return element(GetByLocator.getLocator("addCart"));
    }
    /**
     * 获取右上角购物车element
     */
     public WebElement getShopCartElement(){
         return  element(GetByLocator.getLocator("shopCart"));
     }

    /**
     * 获取购物车数量element
     */
    public WebElement getShopCartNumElement(){
        return element(GetByLocator.getLocator("cartNum"));
    }
    /**
     * 获取课程详情页面左上角课程名element
     */
     public  WebElement getCourseNameElement(){
         return nodeElement(GetByLocator.getLocator("courseInfo"),GetByLocator.getLocator("courseInfoText"));
     }
    /**
     * 通过字符节点定位已经购买弹窗确定按钮  :模态框提示商品已经在购物车内
     *
     * */
    public WebElement getReadyBuy() {
        return nodeElement(GetByLocator.getLocator("readBuySure"), GetByLocator.getLocator("readBuySureNode"));
    }

    /**
     * 购物车页面去结算
     */
    public WebElement getGoPayElement(){
       // return nodeElement(GetByLocator.getLocator("shopgopay"),GetByLocator.getLocator("shopgopayNode"));    }
        return element(GetByLocator.getLocator("shopgopay"));
    }



}
