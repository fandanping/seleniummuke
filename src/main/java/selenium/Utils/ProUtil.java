package selenium.Utils;

import java.io.*;
import java.util.Properties;

/**
 * 读取配置文件工具类
 */
public class ProUtil {
    private Properties prop;
    private String filePath;

    /**
     * 构造方法
     */
    public ProUtil(String filePath){
        this.filePath = filePath;
        this.prop=readProperties();
    }

    /**
     * 读取配置文件
     * @return
     */
    private Properties readProperties(){
        Properties prop = new Properties();
        //InputStream inputStream=new FileInputStream(filePath);
        // BufferedInputStream in=new BufferedInputStream(inputStream);
        // prop.load(in);
        try {
            prop.load(this.getClass().getResourceAsStream(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
    /**
     *获取
     * @param key
     * @return
     * @throws IOException
     */
    public String  getPro(String key){
        if(prop.containsKey(key)){
            String username=prop.getProperty(key);
            return  username;
        }else{
            System.out.println("你获取的key值不对");
            return "";
        }
    }
    /**
     * 写入内容
     * */
    public void writePro(String key,String value){
        Properties pro = new Properties();
        try {
            FileOutputStream file = new FileOutputStream(filePath);
            pro.setProperty(key, value);
            pro.store(file, key);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
