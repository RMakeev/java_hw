package ru.stqa.hw.adressbook.model;

public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String nickname;
  private final String addres;
  private final String mobile;
  private final String email;
  private final String notes;

  public ContactData(String firstname, String middlename, String nickname, String addres, String mobile, String email, String notes) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.nickname = nickname;
    this.addres = addres;
    this.mobile = mobile;
    this.email = email;
    this.notes = notes;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getNickname() {
    return nickname;
  }

  public String getAddres() {
    return addres;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }

  public String getNotes() {
    return notes;
  }
}
