package ru.stqa.hw.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    int before = app.getContactHelper().getContactCount();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData(
              "Roman", "Makeev", "Maki",
              "Moscow", "+79999999999", "randommail@random.ru",
              "test", "test1"), true);

    }

    app.getContactHelper().initContactModification(before - 1);
    app.getContactHelper().fillContactForm(new ContactData("Roman", "Makeev", "Maki", "Moscow", "+79999999999", "randommail@random.ru", "test", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);



  }
}
