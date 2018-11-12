package selenium.Utils;

import org.openqa.selenium.By;

/**
 * 封装By
 */
public class GetByLocator {
    public static By getLocator(String key){
        ProUtil properties =new ProUtil("/element.properties");
        String locator=properties.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue= locator.split(">")[1];
        if(locatorType.equals("id")){
            return By.id(locatorValue);
        }else if(locatorType.equals("name")){
            return By.name(locatorValue);
        }else if(locatorType.equals("className")){
            return By.className(locatorValue);
        }else {
            return By.xpath(locatorValue);
        }
    }
}
