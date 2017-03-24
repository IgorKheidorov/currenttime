package MailRu;

import static MailRu.Resourses.ButtonForInput;
import static MailRu.Resourses.ClassForMailbox;
import static MailRu.Resourses.FieldLogin;
import static MailRu.Resourses.FieldPassword;
import static MailRu.Resourses.TestLogin;
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
 * Created by timofeiKyksenok on 23.03.2017.
 */
public class CorrectInput {

  @Test
  public void correctInputChrome() {
    correctInput(new ChromeDriver());
  }

  @Test
  public void correctInputEdge() {
    correctInput(new EdgeDriver());
  }

  @Test
  public void correctInputSafari() {
    correctInput(new SafariDriver());
  }

  @Test
  public void correctInputFirefox() {
    correctInput(new FirefoxDriver());
  }

  @Test
  public void correctInputOpera() {
    correctInput(new OperaDriver());
  }

  @Test
  public void correctInputIE() {
    correctInput(new InternetExplorerDriver());
  }

  private void correctInput(WebDriver driver) {
    driver.get(URL);
    driver.findElement(By.id(FieldLogin)).sendKeys(TestLogin);
    driver.findElement(By.id(FieldPassword)).sendKeys(TestPassword);
    driver.findElement(By.id(ButtonForInput)).click();
    driver.findElement(By.className(ClassForMailbox));
    driver.close();
  }
}
