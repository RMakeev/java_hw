package ru.stqa.hw.adressbook.tests;


import org.testng.annotations.*;
import ru.stqa.hw.adressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavifationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
  }

}
