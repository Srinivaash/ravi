import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      Properties prop=new Properties();
      FileInputStream fis= new FileInputStream("C:\\Users\\MURUGANANDHAM\\eclipse-workspace\\Testnggtest\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fs= new FileOutputStream("C:\\Users\\MURUGANANDHAM\\eclipse-workspace\\Testnggtest\\src\\data.properties");
		prop.store(fs, null);
		
		
		
		
		
		
	}

}