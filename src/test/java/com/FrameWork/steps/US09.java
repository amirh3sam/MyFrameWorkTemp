package com.FrameWork.steps;

import io.cucumber.java.en.Given;

import java.io.InputStream;

public class US09 {

    @Given("user want to login with username and password")
    public void user_want_to_login_with_username_and_password() {

        //this is setup that only works in one class
        // so click on three dot and choose edit (configuration)
        //on left side need to choose which class you want to add the env vaiable
        //then on right side "Environment variable" type username=amir;password=123;
        //apply and ok
        System.out.println(System.getenv("username"));
        System.out.println(System.getenv("password"));
    }

    @Given("user want to use env username and pass")
    public void user_want_to_use_env_username_and_pass() {
        System.out.println(System.getenv("newpass"));
        // this way  you can use this env variable in any class because is coming from the System
        // for window is creating env variable on system

        //first you need to know which shell you use for mac
        //type echo $SHELL
        /*
        For Bash: ~/.bash_profile
        For Zsh: ~/.zshrc
         */

        // for mac first  create this file : touch ~/.zshrc
        //then open the file open ~/.zshrc
        //then type your variable and save like => export username="username"
        //then save that file on command line by typing => source ~/.zshrc


    }
}
