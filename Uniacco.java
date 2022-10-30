import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uniacco {

	public static <WebDriver> void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//C://selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String Exptitle="Amazon";
		String Acttitle=driver.getTitle();
		System.out.println(Acttitle);
		if(Exptitle.equals(Acttitle))
		{
			System.out.println("Exp title match with act title");
		}
		else
		{
			System.out.println("Exp title vary with act title");
		}

	}

	}

}
