package com.bus.managersystem.models;

import javax.validation.constraints.Size;
import java.io.Serializable;

public class UserModel implements Serializable {
    private Long id;
    @Size(min = 4, max = 30)
    private String userName;
    @Size(min = 6, max = 100)
    private String passWord;

    public UserModel() {
        super();
    }

    public UserModel(Long id,String userName, String passWord) {
        super();
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
