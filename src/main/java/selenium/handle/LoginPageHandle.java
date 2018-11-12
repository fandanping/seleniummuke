package selenium.handle;

import selenium.base.DriverBase;
import selenium.page.LoginPage;
/**
 * 操作层
 */
public class LoginPageHandle {
    private DriverBase driverBase;
    //由于是操作的登录，所以要实例化LoginPage
    public LoginPage loginPage;
    public LoginPageHandle(DriverBase driverBase){
        this.driverBase=driverBase;
        loginPage=new LoginPage(driverBase);
    }
    /*
     * 输入用户名
     * */
    public void sendKeysUser(String username){
        loginPage.sendKeys(loginPage.getUserElement(),username);
    }
    /*
     * 输入密码
     * */
    public void sendKeysPassword(String password){
        loginPage.sendKeys(loginPage.getPasswordElement(),password);
    }
    /**
     *点击登录
     */
    public void clickLoginButton(){
        loginPage.click(loginPage.getLoginButtonElement());
    }
    /**
     * 点击自动登录
     */
    public void clickAutoSigin(){
        loginPage.click(loginPage.getAutoLoginElement());
    }
    /**
     * 判断是否是登录页，只要能够识别登录页面的一个输入框即可，这里使用用户名识别
     */
     public boolean assertLoginPage(){
         return loginPage.assertElementIs(loginPage.getUserElement());
     }

}
