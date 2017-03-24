package MailRu;

import static MailRu.Resourses.ButtonForInput;
import static MailRu.Resourses.FieldLogin;
import static MailRu.Resourses.FieldPassword;
import static MailRu.Resourses.TestLogin;
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
public class IncorrectPassword {

  @Test
  public void incorrectPasswordChrome() {
    incorrectPassword(new ChromeDriver());
  }

  @Test
  public void incorrectPasswordEdge() {
    incorrectPassword(new EdgeDriver());
  }

  @Test
  public void incorrectPasswordSafari() {
    incorrectPassword(new SafariDriver());
  }

  @Test
  public void incorrectPasswordFirefox() {
    incorrectPassword(new FirefoxDriver());
  }

  @Test
  public void incorrectPasswordOpera() {
    incorrectPassword(new OperaDriver());
  }

  @Test
  public void incorrectPasswordIE() {
    incorrectPassword(new InternetExplorerDriver());
  }

  private void incorrectPassword(WebDriver  driver) {
    driver.get(URL);
    driver.findElement(By.id(FieldLogin)).sendKeys(TestLogin);
    driver.findElement(By.id(FieldPassword)).sendKeys("23.03.201");
    driver.findElement(By.id(ButtonForInput)).click();
    driver.findElement(By.className("b-login__errors"));
    driver.close();
  }
}
