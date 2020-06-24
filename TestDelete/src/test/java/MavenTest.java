import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeAll()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lshmidt\\SeleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://translate.google.com");
    }

    @Test
    public void test01() {
        driver.findElement(By.id("source")).sendKeys("green");
    }

    @AfterClass
    public static void stop(){
        driver.quit();
    }
}
