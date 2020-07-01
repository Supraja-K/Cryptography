/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KEERTHIVASAN
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;


public class Encryption{
    static String s="Hello",str="";
    static int[] n=new int[s.length()];
    public static void main(String args[]){
   
        int num;
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            num=stringToNumber(c[i]);
            n[i]=num;
            System.out.println(n[i]);
        }
    }
        
    public static int stringToNumber(char ch){
        int result = 0;
        result = (int) ch- (int)'a' + 1;
        //return result;
    
    
        
        final Map<Character, Integer> map;
        map = new HashMap<>();  
        // or map = new HashMap<Character, Integer> if you are using something before Java 7.
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);

        for(final char c : str.toCharArray())
        {
            final Integer val;

            val = map.get(c);

            if(val == null)
            {   
                // some sort of error
            }
            else
            {
                System.out.print(val + " ");
            }
        }
    return 0;
    
    }
}
    

