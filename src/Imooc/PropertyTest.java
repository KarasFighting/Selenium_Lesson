package Imooc;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream; 
import java.util.Iterator;
import java.util.Properties; 

public class PropertyTest {
    public static void main(String[] args) { 
        Properties prop = new Properties();     
        try{
            //读取属性文件a.properties
        	InputStream fis =ProUtil.class.getClassLoader().getResourceAsStream("a.properties");
            prop.load(fis);     ///加载属性列表
            Iterator<String> it=prop.stringPropertyNames().iterator();
            while(it.hasNext()){
                String key=it.next();
                System.out.println(key+":"+prop.getProperty(key));
            }
            fis.close();
            
            ///保存属性到b.properties文件
            FileOutputStream oFile = new FileOutputStream("b.properties", true);//true表示追加打开
            prop.setProperty("phone", "10086");
            prop.store(oFile, "The New properties file");
            oFile.close();
           // System.out.println(oFile);
        }
        catch(Exception e){
            System.out.println(e);
        }
    } 
}