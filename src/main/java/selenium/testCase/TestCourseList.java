package selenium.testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.base.DriverBase;
import java.util.ArrayList;
import java.util.List;

public class TestCourseList extends  CaseBase{
    public DriverBase driver;
    public TestCourseList(){
        this.driver=InitDriverBase("firefox");
    }
    @Test
    public void CourseList(){
        driver.get("https://coding.imooc.com/");
        List<String> listString =this.listElement();
        for(int i=12;i<listString.size();i++){
            JavascriptExecutor js = (JavascriptExecutor) driver.getDriver();
            js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]")));
            driver.back();
            //理论+实战，系统掌握RocketMQ核心技术, 挑战“双11” 高并发抗压实战
            //返回
            //driver.back();
        }
    }

    /**
     * 获取所有的课程List
     * @return
     */
    public List<String> listElement(){
        List<String> listString =new ArrayList<String>();
        //拿到实战中的列表集合元素
        WebElement element=driver.findElement(By.className("shizhan-course-list"));
        //拿到实战课程的元素集合
        List<WebElement> courseList=element.findElements(By.className("shizhan-intro-box"));
        for(WebElement element1:courseList){
            //得到每个课程的关键信息文本且放入集合中
            listString.add(element1.findElement(By.className("shizan-desc")).getText());
            System.out.println(element1.findElement(By.className("shizan-desc")).getText());
        }
        return listString;
    }


}
