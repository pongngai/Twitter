/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Twitter.CSC319oosd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * 
 * @author USER
 */
public class Twitter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*TwitterUI ui = new TwitterUI();
        ui.setVisible(true);
        Scanner sc = new Scanner(System.in);
        Tweet tw = new Tweet("info.txt");
        System.out.print("Input : ");
        String n = sc.next();
        System.out.println("");
        tw.searchWord(n);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        SelectData(input);*/
        AddData("Test","Test","Test","Test","Test");
    }
    
        public static void AddData(String name,String text,String location,String device,String created){
        try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/twitter?zeroDateTimeBehavior=convertToNull","root","root");
        PreparedStatement p = connection.prepareStatement("INSERT INTO TWEETS (name,text,location,device,created) VALUES (?,?,?,?,?)");
        p.setString(1,name);
        p.setString(2,text);
        p.setString(3,location);
        p.setString(4,device);
        p.setString(5,created);
        p.executeUpdate();
        }catch(Exception e){
            
        }
        }
        
        public static void SelectData(String idbooks){
            try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/twitter?zeroDateTimeBehavior=convertToNull","root","root");
        PreparedStatement p = connection.prepareStatement("SELECT * FROM tweets");
        ResultSet resultSet = p.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        }catch(Exception e){
            
        }
        }
    }
    

