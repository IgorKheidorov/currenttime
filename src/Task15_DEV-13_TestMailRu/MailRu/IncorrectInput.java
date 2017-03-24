package MailRu;

import static MailRu.Resourses.ButtonForInput;
import static MailRu.Resourses.FieldLogin;
import static MailRu.Resourses.FieldPassword;
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
public class IncorrectInput {

  @Test
  public void incorrectInputChrome() {
    incorrectInput(new ChromeDriver());
  }

  @Test
  public void incorrectInputEdge() {
    incorrectInput(new EdgeDriver());
  }

  @Test
  public void incorrectInputSafari() {
    incorrectInput(new SafariDriver());
  }

  @Test
  public void incorrectInputFirefox() {
    incorrectInput(new FirefoxDriver());
  }

  @Test
  public void incorrectInputOpera() {
    incorrectInput(new OperaDriver());
  }

  @Test
  public void incorrectInputIE() {
    incorrectInput(new InternetExplorerDriver());
  }

  private void incorrectInput(WebDriver driver) {
    driver.get(URL);
    driver.findElement(By.id(FieldLogin)).sendKeys("!@#$%^&*(_)+-=-");
    driver.findElement(By.id(FieldPassword)).sendKeys("!@#$%^&*(_)+-=-");
    driver.findElement(By.id(ButtonForInput)).click();
    driver.findElement(By.className("b-login__errors"));
    driver.close();
  }
}
