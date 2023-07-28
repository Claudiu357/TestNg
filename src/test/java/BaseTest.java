import driver.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected ChromeDriver driver;

    @BeforeMethod
    public void initChromeBrowser(){
        driver = ChromeDriverManager.createChromeDriverWithOptions();
    }

    @AfterMethod
    public void quitBrowser(){
        if(driver != null){
            driver.quit();
        }
    }
}
