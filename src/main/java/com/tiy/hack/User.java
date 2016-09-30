package com.tiy.hack;

import javax.persistence.*;

/**
 * Created by RdDvls on 9/30/16.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String firstName;

    @Column(nullable = false)
    String lastName;

    @Column(nullable = false)
    String techSkills;

    @Column(nullable = false, unique = true)
    String email;

    @Column(nullable = false)
    String password;

    public User(){

    }

    public User(int id, String firstName, String lastName, String techSkills, String email, String password) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.techSkills = techSkills;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFistName() {
        return firstName;
    }

    public void setFistName(String fistName) {
        this.firstName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTechSkills() {
        return techSkills;
    }

    public void setTechSkills(String techSkills) {
        this.techSkills = techSkills;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
