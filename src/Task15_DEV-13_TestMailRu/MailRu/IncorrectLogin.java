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
public class IncorrectLogin {


  @Test
  public void incorrectLoginChrome() {
    incorrectLogin(new ChromeDriver());
  }

  @Test
  public void incorrectLoginEdge() {
    incorrectLogin(new EdgeDriver());
  }

  @Test
  public void incorrectLoginSafari() {
    incorrectLogin(new SafariDriver());
  }

  @Test
  public void incorrectLoginFirefox() {
    incorrectLogin(new FirefoxDriver());
  }

  @Test
  public void incorrectLoginOpera() {
    incorrectLogin(new OperaDriver());
  }

  @Test
  public void incorrectLoginIE() {
    incorrectLogin(new InternetExplorerDriver());
  }

  private void incorrectLogin(WebDriver driver) {
    driver.get(URL);
    driver.findElement(By.id(FieldLogin)).sendKeys("tat-dev1");
    driver.findElement(By.id(FieldPassword)).sendKeys(TestPassword);
    driver.findElement(By.id(ButtonForInput)).click();
    driver.findElement(By.className("b-login__errors"));
    driver.close();
  }
}
