package testng;

/*

public class TestNGListenerScreen  extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult tr) {
     super.onTestSuccess(tr);
    }
    //ITestResult：运行当前case对象
    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println(tr.getInstance());
        System.out.println("测试方法执行错误");
        BaseDriver base=(BaseDriver)tr.getInstance();
        takeScreenShot(base.GetDriver());
       super.onTestFailure(tr);
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
       super.onTestSkipped(tr);
    }
    */
/**
     * 自动截图
     *//*

    public void takeScreenShot(WebDriver driver){
        SimpleDateFormat sf=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        Calendar cal=Calendar.getInstance();
        Date date=cal.getTime();
        String dateStr=sf.format(date);
        String path=this.getClass().getSimpleName()+"_"+dateStr+".png";
        takeScreenShot((TakesScreenshot) driver,path);
    }

    */
/**
     * 传入参数截图
     *//*

    public void takeScreenShot(TakesScreenshot drivername, String path){
          String currentPath=System.getProperty("user.dir");
          File srcFile=drivername.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile,new File(currentPath+"\\"+path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
*/
