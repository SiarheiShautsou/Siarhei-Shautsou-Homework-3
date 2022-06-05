package com.sheva.domain;

import java.util.List;
import java.util.Objects;

public class User {

    public static final long DEFAULT_ID = 123456789000L;

    private long id;

    private String name;

    private String surname;

    private List<User> friends;

    public User() {
        this.id = DEFAULT_ID ;
        this.name = "Сергей";
        this.surname = "Шевцов";
    }

    public User(long id, String name, String surname, List<User> friends) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.friends = friends;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<User> getFriends() {
        return friends;
    }

    public List<User> setFriends(List<User> friends) {
        this.friends = friends;
        return friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) &&
                Objects.equals(friends, user.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, friends);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", friends=" + friends +
                '}';
    }
}
