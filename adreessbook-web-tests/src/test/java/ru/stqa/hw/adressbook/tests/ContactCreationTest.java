package ru.stqa.hw.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavifationHelper().gotoContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Roman", "Makeev", "Maki", "Moscow", "+79999999999", "randommail@random.ru", "test", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }


}
