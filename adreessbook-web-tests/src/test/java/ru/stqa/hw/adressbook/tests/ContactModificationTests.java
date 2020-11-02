package ru.stqa.hw.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.model.ContactData;

import java.util.List;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData(
              "Roman", "Makeev", "Maki",
              "Moscow", "+79999999999", "randommail@random.ru",
              "test"), true);

    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().initContactModification(before.size() - 1);
    app.getContactHelper().fillContactForm(new ContactData("Roman", "Makeev", "Maki", "Moscow", "+79999999999", "randommail@random.ru", "test"), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());



  }
}
