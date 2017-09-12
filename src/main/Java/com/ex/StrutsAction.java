package com.ex;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsAction extends ActionSupport{
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StrutsAction() {

    }

    public String execute(){
        if(name.equals("jiang") && password.equals("123"))
            return "success";
        return "error";
    }
}
