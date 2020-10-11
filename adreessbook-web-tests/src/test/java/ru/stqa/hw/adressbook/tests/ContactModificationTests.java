package ru.stqa.hw.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Roman", "Makeev", "Maki", "Moscow", "+79999999999", "randommail@random.ru", "test"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();


  }
}
