package ru.stqa.hw.adressbook.tests;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.model.ContactData;
import ru.stqa.hw.adressbook.model.Contacts;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTest extends TestBase {

  @Test
  @DataProvider
  public Iterator<Object[]> validContacts() throws IOException {
    List<Object[]> list = new ArrayList<Object[]>();
    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/contacts.csv")));
    String line = reader.readLine();
    while (line != null ) {
      String[] split = line.split(";");
      list.add(new Object[] {new ContactData().withFirstname(split[0]).withLastname(split[1]).withHomePhone(split[2])
              .withMobilePhone(split[3]).withEmail(split[4]).withAddress(split[5])});
      line = reader.readLine();
    }
    return list.iterator();
  }

  @Test(dataProvider = "validContacts")
  public void testContactCreation(ContactData contact) throws Exception {
    File photo = new File("src/test/resources/IMG.jpg");
    Contacts before = app.contact().all();
    app.contact().create(contact);
    assertThat(app.contact().count(), equalTo(before.size() + 1));
    Contacts after = app.contact().all();
    assertThat(after, equalTo(
            before.withAdded(contact.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
  }

  @Test(enabled = false)
  public void testBadContactCreation() throws Exception {
    Contacts before = app.contact().all();
    File photo = new File("src/test/resources/IMG.jpg");
    ContactData contact = new ContactData().withFirstname("Roman").withLastname("Makeev").withMobilePhone("880099911").withEmail("test@test.test").withPhoto(photo);
    app.contact().create(contact);
    assertThat(app.contact().count(), equalTo(before.size()));
    Contacts after = app.contact().all();
    assertThat(after, equalTo(before));


  }
}
