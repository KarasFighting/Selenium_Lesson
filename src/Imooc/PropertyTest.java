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
            //��ȡ�����ļ�a.properties
        	InputStream fis =ProUtil.class.getClassLoader().getResourceAsStream("a.properties");
            prop.load(fis);     ///���������б�
            Iterator<String> it=prop.stringPropertyNames().iterator();
            while(it.hasNext()){
                String key=it.next();
                System.out.println(key+":"+prop.getProperty(key));
            }
            fis.close();
            
            ///�������Ե�b.properties�ļ�
            FileOutputStream oFile = new FileOutputStream("b.properties", true);//true��ʾ׷�Ӵ�
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