package MailRu;

import static MailRu.Resourses.ButtonForInput;
import static MailRu.Resourses.FieldLogin;
import static MailRu.Resourses.FieldPassword;
import static MailRu.Resourses.TestPassword;
import static MailRu.Resourses.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by timofeiKyksenok on 24.03.2017.
 */
public class IncorrectBigLogin {

  @Test
  public void incorrectBigLoginChrome() {
    incorrectBigLogin(new ChromeDriver());
  }

  @Test
  public void incorrectBigLoginEdge() {
    incorrectBigLogin(new EdgeDriver());
  }

  @Test
  public void incorrectBigLoginSafari() {
    incorrectBigLogin(new SafariDriver());
  }

  @Test
  public void incorrectBigLoginFirefox() {
    incorrectBigLogin(new FirefoxDriver());
  }

  @Test
  public void incorrectBigLoginOpera() {
    incorrectBigLogin(new OperaDriver());
  }

  @Test
  public void incorrectBigLoginIE() {
    incorrectBigLogin(new InternetExplorerDriver());
  }

  private void incorrectBigLogin(WebDriver driver) {
    driver.get(URL);
    driver.findElement(By.id(FieldLogin)).sendKeys("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
    driver.findElement(By.id(FieldPassword)).sendKeys(TestPassword);
    driver.findElement(By.id(ButtonForInput)).click();
    driver.findElement(By.className("b-login__errors"));
    driver.close();
  }
}
