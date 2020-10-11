package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.TestBase;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    selectContact();
    deleteSelectedContact();
    confirmSelection();
    goToHomePage();
  }


}