package com.assignment.model;

import javax.persistence.*;

@Entity
@Table(name ="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Username;
    private String password;
    private String Fullname;

    public Users() {
    }

    public Users(String password, String Fullname) {
        this.password = password;
        this.Fullname = Fullname;
    }



    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

}
