package ru.stqa.hw.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
  public SessionHelper(WebDriver wd) {

    super(wd);
  }

  public void login(String username, String password) {
    wd.get("http://localhost/");
    type(By.name("user"), username);
    type(By.name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
  }


}
