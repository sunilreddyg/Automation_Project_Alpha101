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
public class FacebookRegistrationTest 
{
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
  public void facebookRegistration() {
    driver.get("https://www.facebook.com/");
    driver.manage().window().setSize(new Dimension(776, 557));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.linkText("Create new account")).click();
    driver.findElement(By.name("firstname")).sendKeys("Uday");
    driver.findElement(By.name("lastname")).sendKeys("Singh");
    driver.findElement(By.name("reg_email__")).sendKeys("udaysingh@gmail.com");
    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("udaysingh@gmail.com");
    driver.findElement(By.id("password_step_input")).click();
    driver.findElement(By.id("password_step_input")).sendKeys("Hello@123435");
    driver.findElement(By.id("day")).click();
    {
      WebElement dropdown = driver.findElement(By.id("day"));
      dropdown.findElement(By.xpath("//option[. = '16']")).click();
    }
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'Feb']")).click();
    }
    driver.findElement(By.id("year")).click();
    {
      WebElement dropdown = driver.findElement(By.id("year"));
      dropdown.findElement(By.xpath("//option[. = '2021']")).click();
    }
    driver.findElement(By.xpath("//span[2]/input")).click();
  }
}
