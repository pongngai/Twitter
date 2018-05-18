/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Twitter.CSC319oosd;

import java.io.IOException;

/**
 *
 * @author USER
 */
public class Test {
    public static void main(String[]args) throws IOException{
        Tweet tw = new Tweet("test.csv");
        tw.searchWord("chnpy");        
    }
}
