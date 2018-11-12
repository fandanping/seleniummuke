package selenium.testCase;

import selenium.base.DriverBase;

/**
 * 生成driver(初始化浏览器)
 */
public class CaseBase {
    public DriverBase InitDriverBase(String browser) {
        return new DriverBase(browser);
    }
}
