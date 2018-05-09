/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Twitter.CSC319oosd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


/**
 *
 * @author USER
 */
public class Tweet extends TwitterUI {

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
        String keep = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().contains(n.toLowerCase())) {
                System.out.println(list.get(i));
                //keep += list.get(i) + "\n";
                count++;
            }
        }
        //jTextArea1.setText(keep);
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
