package org.example.springazure;

public class User {
    private String name;
    private String surname;
    private String message;

    public User(String name, String surname, String message) {
        this.name = name;
        this.surname = surname;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInfo() {
        return message;
    }

    public void setInfo(String message) {
        this.message = message;
    }
}
