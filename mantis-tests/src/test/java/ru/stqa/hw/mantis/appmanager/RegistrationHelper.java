package ru.stqa.hw.mantis.appmanager;

import org.openqa.selenium.WebDriver;
import ru.stqa.hw.mantis.appmanager.ApplicationManager;

public class RegistrationHelper {
  private final ApplicationManager app;
  private WebDriver wd;

  public RegistrationHelper(ApplicationManager app) {
    this.app = app;
    wd = app.getDriver();
  }

  public void start(String username, String email) {
    wd.get(app.getProperty("web.baseURL")+"/signup_page.php");
  }
}