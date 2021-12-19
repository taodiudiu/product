package com.spring.product.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias(value = "User")
public class User implements Serializable {
    private static final long serialVersionUID = -4003358618662233604L;

    private int id;
    private String userName;
    private String note;

    public User(String userName, String note) {
        this.userName = userName;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
