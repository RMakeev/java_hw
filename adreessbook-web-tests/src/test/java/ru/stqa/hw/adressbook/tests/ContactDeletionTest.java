package ru.stqa.hw.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.model.ContactData;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    int before = app.getContactHelper().getContactCount();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData(
              "Roman", "Makeev", "Maki",
              "Moscow", "+79999999999", "randommail@random.ru",
              "test", "test1"), true);

    }
    app.getContactHelper().selectContact(before - 1);
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().confirmSelection();
    app.getNavifationHelper().goToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
  }


}