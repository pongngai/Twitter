/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * 
 * @author USER
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
           // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Tweet tw = new Tweet("info.txt");
        //tw.getTweet("test.txt");
        //ArrayList<String> collect = tw.getTweet("test.txt");
        //Iterator<String> it = collect.iterator();
        //System.out.println(tw.getNumberOfTweets());
        //System.out.println(.get(0));
        System.out.print("Input : ");
        String n = sc.next();
        System.out.println("");
        tw.searchWord(n);
        //System.out.println(tw.getTweet(0));
        //System.out.println(tw.list.size());
        //tw.getAll();
    }
    /*public static void printTweets() throws IOException {
        Scanner sc = new Scanner(System.in);
        Tweet tw = new Tweet("info.txt");
        String n = sc.next();
        System.out.print("Input : ");
        System.out.println();
        tw.searchWord(n);
    }*/
}
