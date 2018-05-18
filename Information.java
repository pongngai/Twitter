/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Twitter.CSC319oosd;

/**
 *
 * @author USER
 */
public class Information {
    public String id;
    public String name;
    public String text;
    public String location;
    public String device;
    public String created;

    public Information(String id, String name, String text, String location, String device, String created) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.location = location;
        this.device = device;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
    
    @Override
    public String toString(){
       return "Username : " + name + "\n"
                        + "Location & Date : " + location + " " + device
                        + " " + created + "\n"
                        + "Message : " + text + "\n"+
                        "__________________________________________________________________" + "\n";
    }
    
}
