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
        //AddData("Test","Test","Test","Test","Test");
        Tweet tw = new Tweet("test2.csv");
        //tw.getAll();
        tw.searchWord("ร้องไห้");
        //.searchUsername("kratai1235");
    }
}
