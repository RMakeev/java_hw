package ru.stqa.hw.adressbook.model;

import java.util.Objects;

public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String nickname;
  private final String addres;
  private final String mobile;
  private final String email;
  private final String notes;
  private String group;

  public ContactData(String firstname, String middlename, String nickname, String addres, String mobile, String email, String notes) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.nickname = nickname;
    this.addres = addres;
    this.mobile = mobile;
    this.email = email;
    this.notes = notes;
    this.group = group;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(firstname, that.firstname) &&
            Objects.equals(middlename, that.middlename) &&
            Objects.equals(nickname, that.nickname) &&
            Objects.equals(addres, that.addres) &&
            Objects.equals(mobile, that.mobile) &&
            Objects.equals(email, that.email) &&
            Objects.equals(notes, that.notes) &&
            Objects.equals(group, that.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, middlename, nickname, addres, mobile, email, notes, group);
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "firstname='" + firstname + '\'' +
            ", middlename='" + middlename + '\'' +
            ", nickname='" + nickname + '\'' +
            ", addres='" + addres + '\'' +
            ", mobile='" + mobile + '\'' +
            ", email='" + email + '\'' +
            ", notes='" + notes + '\'' +
            ", group='" + group + '\'' +
            '}';
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

  public String getGroup() {
    return group;
  }
}
