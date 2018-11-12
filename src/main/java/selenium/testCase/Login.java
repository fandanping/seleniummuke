package selenium.testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.base.DriverBase;
import selenium.business.LoginPro;


public class Login  extends  CaseBase{
    public DriverBase driverBase;
    public LoginPro loginPro;
    public Login(){
        this.driverBase=InitDriverBase("chrome");
        loginPro=new LoginPro(driverBase);
    }
    @Test
    public void getLoginHome() {
        driverBase.get("http://www.imooc.com");
        driverBase.getWindowMax();
        driverBase.findElement(By.id("js-signin-btn")).click();
        //driverBase.findElement(GetByLocator.getLocator("loginButton")).click();
        driverBase.sleep(2000);
    }
    @Test(dependsOnMethods ={"getLoginHome"} )
    public void testLogin(){
        loginPro.login("18602474229","fandanping521");
    }


}
