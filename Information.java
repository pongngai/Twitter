/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author USER
 */
public class Information {
    private String name;
    private String message;
    
    public Information(String name,String message){
        this.name = name;
        this.message = message;
    }
    
    public Information(String message){
        this.message = message;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
     
}
