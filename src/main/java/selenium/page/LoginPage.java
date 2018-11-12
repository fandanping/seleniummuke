package selenium.page;

import org.openqa.selenium.WebElement;
import selenium.Utils.GetByLocator;
import selenium.base.DriverBase;


public class LoginPage extends BasePages {
  public LoginPage(DriverBase driverBase){
      super(driverBase);
  }

    /**
     * 获取用户名输入框element
     * @return
     */
  public WebElement getUserElement(){
      //找到properties中的username变量
      return element(GetByLocator.getLocator("username"));
  }
    /*
     * 获取密码输入框Element
     * */
    public WebElement getPasswordElement() {
        return element(GetByLocator.getLocator("userpass"));
    }

    /*
     * 获取登录按钮输入框
     * */
    public WebElement getLoginButtonElement() {
        return element(GetByLocator.getLocator("loginbutton"));
    }
    /*
 * 获取自动登录Element
 *
 * */
    public WebElement getAutoLoginElement() {
        return element(GetByLocator.getLocator("autoSigin"));
    }



}
