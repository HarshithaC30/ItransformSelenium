package Demo.JenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    /*private Selenium selenium;
    
    @Before
    public void setup() throws Exception{
    	selenium = new DefaultSelenium("localhost", 4444, "*googlechrome C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.gmail.com");
    	selenium.start();
    	selenium.setSpeed("1500");
    }
    
    @Test
    public void testmytestcase() throws Exception{
    	selenium.open("http://www.google.com");
    	selenium.type("id=lst-ib", "selenium");
    	selenium.type("id=lst-ib", "selenium");
    	selenium.click("name=btnG");
    	selenium.click("name=btnG");
    	selenium.type("selenium interview questions", "selenium");
    	selenium.type("selenium interview questions", "selenium");
    	selenium.click("name=guru99");
    	selenium.click("name=guru99");
    	assertTrue(selenium.isTextPresent(""));
    }
    
    @After
    public void tearDown() throws Exception{
    	selenium.stop();
    }*/
	
	public static void main(String[] args) {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");	// <-- Change this path
	       WebDriver driver = new ChromeDriver();
	       String baseUrl = "https://www.google.com/gmail/about/#";
	       String expectedTitle = "about";
	       String actualTitle = "";
	       driver.get(baseUrl);
	       actualTitle = driver.getTitle();
	       if (actualTitle.contentEquals(expectedTitle)){
	           System.out.println("TEST PASSED!");
	       } else {
	           System.out.println("TEST FAILED");
	       }
	       driver.close();
	   }
	
}
