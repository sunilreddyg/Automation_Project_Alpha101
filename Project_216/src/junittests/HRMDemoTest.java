package junittests;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class HRMDemoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() 
  {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() 
  {
    driver.quit();
  }
  @Test
  public void hRMDemo() 
  {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().setSize(new Dimension(776, 557));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.cssSelector(".oxd-button")).click();
    {
      WebElement element = driver.findElement(By.linkText("Claim"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".oxd-main-menu-item-wrapper:nth-child(6) .oxd-text")).click();
    driver.findElement(By.linkText("Contact Details")).click();
    {
      WebElement element = driver.findElement(By.linkText("Emergency Contacts"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".oxd-input--focus")).click();
    driver.findElement(By.cssSelector(".oxd-input--focus")).sendKeys("paul3@gmail.com");
    driver.findElement(By.cssSelector(".oxd-button--secondary")).click();
    driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
    driver.findElement(By.linkText("Logout")).click();
  }
}
