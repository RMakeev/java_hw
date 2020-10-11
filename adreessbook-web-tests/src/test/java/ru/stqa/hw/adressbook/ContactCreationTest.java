package ru.stqa.hw.adressbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    gotoContactPage();
    fillContactForm(new ContactData("Roman", "Makeev", "Maki", "Moscow", "+79999999999", "randommail@random.ru", "test"));
    submitContactCreation();
    returnToHomePage();
  }


}
