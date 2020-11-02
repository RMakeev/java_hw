package ru.stqa.hw.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData(
              "Roman", "Makeev", "Maki",
              "Moscow", "+79999999999", "randommail@random.ru",
              "test"), true);

    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().confirmSelection();
    app.getNavifationHelper().goToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() -1);
    Assert.assertEquals(before, after);
  }


}