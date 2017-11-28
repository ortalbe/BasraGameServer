package com.basra.game.beans;

import javax.xml.bind.annotation.*;

/**
 * Created by Ortal on 11/22/2017.
 */

@XmlRootElement
public class User {

    private Integer ID;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;

    private static Integer counterID=1;


    public User(String firstName, String lastName, String email, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.ID = counterID++;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @XmlElement
    public Integer getID() {
        return ID;
    }

    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public String getEmail() {
        return email;
    }

    @XmlElement
    public String getUserName() {
        return userName;
    }
}
