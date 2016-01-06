package _loose_coupling_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TVUser {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Properties pr = new Properties();
		InputStream is = new FileInputStream("src/_loose_coupling_/product.properties");
		pr.load(is);

		String className = pr.getProperty("tv");
		Class clazz = Class.forName(className);

		TV tv = (TV)clazz.newInstance();
		tv.powerOn();
		tv.soundUp();
	}

}
