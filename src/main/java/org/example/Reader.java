package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Reader  {
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String faculty;
    private int birth;
    private int phoneNumber;

    public Reader(String login,String password,String firstName, String lastName, String faculty, int birth, int phoneNumber) {
        this.login=login;
        this.password=password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.birth = birth;
        this.phoneNumber = phoneNumber;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getBirth() {
        return birth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
