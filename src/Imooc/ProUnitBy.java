package Imooc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProUnitBy {
	private Properties prop; 
    private String filePath;
    /*
     * 构造方法
     * */
    public ProUnitBy(String filePath) {
    	this.filePath = filePath;
    	this.prop = readProperties();
    }
    
    /*
     * 读取配置文件
     * */
    private Properties readProperties() {
    	//　Properties类继承Hashtable类并且实现了Map接口，也是使用一种键值对的形式来保存属性集。不过Properties有特殊的地方，就是它的键和值都是字符串类型。
    	Properties prop = new Properties();
    	//负责加载Java.class的这部分就叫做ClassLoader,中文叫做类加载器。
    	try {
        	InputStream fis =ProUtil.class.getClassLoader().getResourceAsStream(filePath);
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
    }
    
	public String getPro(String key){
		
		/*
		 这种写法要保证element.properties和ProUtil.java在同级目录下
		 * FileInputStream fs = new FileInputStream("a.properties");
        InputStream in = new BufferedInputStream (fs);放入缓存
        */
		if(prop.containsKey(key)) {
			String username = prop.getProperty(key);
		}else {
			System.out.println("获取的key不正确");
		}
		
		return "";
		

	}
	
	
	
}
