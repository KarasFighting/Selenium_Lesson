package Imooc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProUnitBy {
	private Properties prop; 
    private String filePath;
    /*
     * ���췽��
     * */
    public ProUnitBy(String filePath) {
    	this.filePath = filePath;
    	this.prop = readProperties();
    }
    
    /*
     * ��ȡ�����ļ�
     * */
    private Properties readProperties() {
    	//��Properties��̳�Hashtable�ಢ��ʵ����Map�ӿڣ�Ҳ��ʹ��һ�ּ�ֵ�Ե���ʽ���������Լ�������Properties������ĵط����������ļ���ֵ�����ַ������͡�
    	Properties prop = new Properties();
    	//�������Java.class���ⲿ�־ͽ���ClassLoader,���Ľ������������
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
		 ����д��Ҫ��֤element.properties��ProUtil.java��ͬ��Ŀ¼��
		 * FileInputStream fs = new FileInputStream("a.properties");
        InputStream in = new BufferedInputStream (fs);���뻺��
        */
		if(prop.containsKey(key)) {
			String username = prop.getProperty(key);
		}else {
			System.out.println("��ȡ��key����ȷ");
		}
		
		return "";
		

	}
	
	
	
}
