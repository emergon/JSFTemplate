package com.emergon;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//This is a CDI bean. Maybe it is also a managed bean.

//gives the bean a name, which is primarily used to reference
//it via EL. Without any attributes this name defaults to the simple class
//name with the first letter in lowercase, thus "helloWorld" here. It will
//be available by #{helloWorld} in EL. This can be used in JSF pages.
@Named(value = "helloWorld")
//gives the bean a scope, which means the same
//instance of the bean is used within a given lifespan. In this case that
//lifespan is the duration of an HTTP request. When the scope ends,
//the bean is automatically destroyed. 
@RequestScoped
public class HelloWorld {

    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }
    
    public void submit(){
        output = "Hello World, you typed:"+getInput();
    }
    
    
}
