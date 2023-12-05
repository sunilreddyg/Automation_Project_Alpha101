package browserlaunch;
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
public class FBRegistrationTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void fBRegistration() {
    driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    driver.manage().window().setSize(new Dimension(816, 576));
    driver.findElement(By.linkText("Create new account")).click();
    driver.findElement(By.name("firstname")).sendKeys("Hari");
    driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("Babu");
    driver.findElement(By.name("reg_email__")).sendKeys("info@gmail.com");
    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("info@gmail.com");
    driver.findElement(By.id("password_step_input")).sendKeys("hello@123");
  }
}
