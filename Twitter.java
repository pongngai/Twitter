/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Twitter.CSC319oosd;

import java.io.IOException;
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
        TwitterUI ui = new TwitterUI();
        ui.setVisible(true);
        Scanner sc = new Scanner(System.in);
        Tweet tw = new Tweet("info.txt");
        System.out.print("Input : ");
        String n = sc.next();
        System.out.println("");
        tw.searchWord(n);
    }
    
}
