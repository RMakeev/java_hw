package ru.stqa.hw.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.model.ContactData;

import java.util.List;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().createContact(new ContactData("Roman",
            "Makeev", "Maki", "Moscow",
            "+79999999999", "randommail@random.ru",
            "test"), true);
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }


}
