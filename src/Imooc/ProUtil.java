package Imooc;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

//读取配置文件3-8
public class ProUtil {
	public void getPro() throws Exception{
		//　Properties类继承Hashtable类并且实现了Map接口，也是使用一种键值对的形式来保存属性集。不过Properties有特殊的地方，就是它的键和值都是字符串类型。
		Properties prop = new Properties();
		//负责加载Java.class的这部分就叫做ClassLoader,中文叫做类加载器。
		InputStream fis =ProUtil.class.getClassLoader().getResourceAsStream("element.properties");
		
		/*
		 这种写法要保证element.properties和ProUtil.java在同级目录下
		 * FileInputStream fs = new FileInputStream("a.properties");
        InputStream in = new BufferedInputStream (fs);放入缓存
        */
		prop.load(fis);
		String username = prop.getProperty("username");
		System.out.println(username);
		

	}
	
	public static void main(String[] args) throws Exception {
		ProUtil pro = new ProUtil();
		pro.getPro();
	}
	
}
