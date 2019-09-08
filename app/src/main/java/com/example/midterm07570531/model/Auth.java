package com.example.midterm07570531.model;

public class Auth {
    private  static final String EMAIL = "masri_p@silpakorn.edu";
    private  static final String PASSWORD = "123456";

    private String mEmail ;
    private String mPassword ;

    public Auth(String email, String password) {
        this.mEmail = email;
        this.mPassword = password;
    }

    public boolean check()
    {
        if(mEmail.equals(EMAIL)&& mPassword.equals(PASSWORD)){
            return true ;
        } else {
            return false ;
        }
    }
}
