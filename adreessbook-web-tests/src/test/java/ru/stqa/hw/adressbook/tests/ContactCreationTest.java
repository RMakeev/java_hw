package ru.stqa.hw.adressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.model.ContactData;
import ru.stqa.hw.adressbook.model.Contacts;



import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    Contacts before = app.contact().all();
    ContactData contact = new ContactData().withFirstname("Roman").withLastname("Makeev").withMobilePhone("88008008888").withEmail("test@test.ts.test");
    app.contact().create(contact);
    assertThat(app.contact().count(), equalTo(before.size() + 1));
    Contacts after = app.contact().all();
    assertThat(after, equalTo(
            before.withAdded(contact.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));


  }

  @Test
  public void testBadContactCreation() throws Exception {
    Contacts before = app.contact().all();
    ContactData contact = new ContactData().withFirstname("Roman'").withLastname("Makeev").withMobilePhone("88008008888").withEmail("test@test.ts.test");
    app.contact().create(contact);
    assertThat(app.contact().count(), equalTo(before.size()));
    Contacts after = app.contact().all();
    assertThat(after, equalTo(before));


  }
}
