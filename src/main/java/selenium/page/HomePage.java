package selenium.page;

import org.openqa.selenium.WebElement;
import selenium.Utils.GetByLocator;
import selenium.base.DriverBase;

public class HomePage extends BasePages{

    public HomePage(DriverBase driver){
        super(driver);
    }
    /**
     * 获取点击登陆element
     * */
    public WebElement getLoginElement(){
        return element(GetByLocator.getLocator("login"));
    }
    /**
     * 获取实战element
     * */
    public WebElement getCodingElement(){
        return nodeElement(GetByLocator.getLocator("tophead"),GetByLocator.getLocator("coding"));
    }

    /**
     * 获取用户名信息element
     * */
    public WebElement getUserNameElement(){
        driver.action(element(GetByLocator.getLocator("header")));
        return element(GetByLocator.getLocator("nameInfo"));
    }


}
