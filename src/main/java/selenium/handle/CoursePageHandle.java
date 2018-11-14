package selenium.handle;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import selenium.base.DriverBase;
import selenium.page.CoursePage;

public class CoursePageHandle {
    private DriverBase driver;
    private CoursePage coursePage;
    public CoursePageHandle(DriverBase driver){
        this.driver=driver;
        coursePage=new CoursePage(driver);
    }
    /**
     * 点击立即购买按钮
     */
    public void clickBuyNew(){
        coursePage.click(coursePage.getBuytriggerElement());
    }
    /**
     * 点击添加购物车按钮
     */
    public void clickAddCart(){
        coursePage.click(coursePage.getAddCartElement());
    }
    /**
     * 点击右上角购物车
     */
    public void clickShopCart(){
        coursePage.click(coursePage.getShopCartElement());
    }
    /**
     * 获取右上角购物车数量
     */
    public String getShopCartNum(){
        return  coursePage.getText(coursePage.getShopCartNumElement());
    }
    /**
     * 获取课程名称
     */
    public String getCourseName(){
       return coursePage.getText(coursePage.getCourseNameElement()) ;
    }
    /**
     * 点击已经购买弹窗的确定按钮
     */
    public void clickReadBuy(){
        coursePage.click(coursePage.getReadyBuy());
    }
    /**
     * 去结算
     * */
    public void clickGoPay(){
        coursePage.click(coursePage.getGoPayElement());
    }

    /**
     * 结算按钮是否显示
     * @return
     */
    public boolean GoPayDisplay(){
        return coursePage.assertElementIs(coursePage.getGoPayElement());
    }



}
