package selenium.business;

import selenium.base.DriverBase;
import selenium.handle.LoginPageHandle;

/**
 * 业务层
 */
public class LoginPro {
    public LoginPageHandle loginPageHandle;
    public LoginPro(DriverBase driverBase){
        loginPageHandle=new LoginPageHandle(driverBase);
    }

    public void login(String username,String password){
        //如果能够识别用户名输入框，那么就代表登录页面存在，就可以进行输入用户名，密码等操作
        if(loginPageHandle.assertLoginPage()){
            //输入用户名
            loginPageHandle.sendKeysUser(username);
            //输入密码
            loginPageHandle.sendKeysPassword(password);
            //点击自动登录
            loginPageHandle.clickAutoSigin();
            //点击登录
            loginPageHandle.clickLoginButton();
        }else{
            System.out.println("页面不存在或者状态不正确");
        }
    }
}
