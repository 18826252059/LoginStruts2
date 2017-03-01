package com.test.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Celine Cheung on 2/28/2017.
 */
public class LoginAction extends ActionSupport {

    public final static String MESSAGE = "hahahhahah";

    private String username;

    private String password;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception {
        setMessage(MESSAGE);
        return "success";
    }

    public String doLogin() throws Exception {
        //1,获取请求的username，password
        //2,从数据库取数据，比对
        //3，正确，写入session，返回；错误，返回json


        return "success";
    }
}
