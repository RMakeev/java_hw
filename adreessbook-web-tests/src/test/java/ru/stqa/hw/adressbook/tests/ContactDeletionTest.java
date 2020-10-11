package ru.stqa.hw.adressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    app.selectContact();
    app.deleteSelectedContact();
    app.confirmSelection();
    app.goToHomePage();
  }


}