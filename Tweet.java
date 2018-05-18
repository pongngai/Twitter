/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Twitter.CSC319oosd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/**
 *
 * @author USER
 */
public class Tweet {

    public ArrayList<Information> list = new ArrayList<Information>();
    String keepWord = "";
    String keepUsername = "";
    String wordCount;
    String userCount;
    int count = 0;

    public Tweet(String n) throws IOException {
        setTweet(n);
    }

    public void setTweet(String filename) throws IOException {
        String path = filename;
        File file = new File(path);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                String[] arr = line.split(",");
                if (arr.length != 0 && arr.length == 6) {
                    //t.AddData(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
                    list.add(new Information(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getNumberOfTweets() {
        return count;
    }

    public void searchWord(String n) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains(n)) {
                keepWord += list.get(i).toString();
                count++;
            }
        }
        wordCount = Integer.toString(count);
    }

    public void searchUsername(String n) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(n)) {
                keepUsername += list.get(i).toString();
                count++;
            }
        }
        userCount = Integer.toString(count);
    }

    public void getAll() {
        for (Information i : list) {
            System.out.println(i.toString());
        }
    }

    public static void AddData(String id, String name, String text, String location, String device, String created) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/twitter?zeroDateTimeBehavior=convertToNull", "root", "root");
            PreparedStatement p = connection.prepareStatement("INSERT INTO TWEETS (idtweets,name,text,location,device,created) VALUES (?,?,?,?,?,?)");
            p.setString(1, id);
            p.setString(2, name);
            p.setString(3, text);
            p.setString(4, location);
            p.setString(5, device);
            p.setString(6, created);
            p.executeUpdate();
        } catch (Exception e) {

        }
    }

    public static void SelectData(String idbooks) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/twitter?zeroDateTimeBehavior=convertToNull", "root", "root");
            PreparedStatement p = connection.prepareStatement("SELECT * FROM tweets");
            ResultSet resultSet = p.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (Exception e) {
        }
    }
}
