package Imooc;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

//��ȡ�����ļ�3-8
public class ProUtil {
	public void getPro() throws Exception{
		//��Properties��̳�Hashtable�ಢ��ʵ����Map�ӿڣ�Ҳ��ʹ��һ�ּ�ֵ�Ե���ʽ���������Լ�������Properties������ĵط����������ļ���ֵ�����ַ������͡�
		Properties prop = new Properties();
		//�������Java.class���ⲿ�־ͽ���ClassLoader,���Ľ������������
		InputStream fis =ProUtil.class.getClassLoader().getResourceAsStream("element.properties");
		
		/*
		 ����д��Ҫ��֤element.properties��ProUtil.java��ͬ��Ŀ¼��
		 * FileInputStream fs = new FileInputStream("a.properties");
        InputStream in = new BufferedInputStream (fs);���뻺��
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
