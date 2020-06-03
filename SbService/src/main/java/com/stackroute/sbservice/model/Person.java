package com.stackroute.sbservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Person implements Serializable {
    @Id
    String email;
    String name;
    String password;
    int    age;

    public Person() {
    }

    public Person(String email, String name, String password,int age) {
        this.email = email;
        this.name  = name;
        this.password = password;
        this.age   = age;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}