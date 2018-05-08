/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author USER
 */
public class Tweet {

    public List<String> list = new ArrayList();
    String delim = " \t\n.,:;?!-/()[]\"\'";
    String line;
    int count = 0;

    public Tweet(String n) throws IOException {
        setTweet(n);
    }

    public void setTweet(String filename) throws IOException {
        try {
            FileReader in = new FileReader(filename);
            BufferedReader b = new BufferedReader(in);
            String text = b.readLine();
            String keep = "";
            while (text != null) {
                keep = keep + text + "\n";
                text = b.readLine();
                if (text == null || text.trim().isEmpty()) {
                    list.add(keep);
                    count++;
                    keep = "";
                    text = b.readLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }

    public int getNumberOfTweets() {
        return count;
    }

    public void searchWord(String n) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().contains(n.toLowerCase())) {
                System.out.println(list.get(i));
                count++;
            }
        }
        System.out.println("Found Results : "+count);
    }

    public String getTweet(int i) {
        return list.get(i);
    }

    public void getAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
//matches("(?i)(.*)" + n + "(.*)")