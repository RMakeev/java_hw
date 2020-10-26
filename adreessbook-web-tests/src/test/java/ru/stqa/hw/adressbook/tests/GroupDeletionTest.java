package ru.stqa.hw.adressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.hw.adressbook.model.GroupData;

public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavifationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before - 1);
  }
}
