/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_vit;
import java.util.*;
/**
 *
 * @author Somit Jain
 */
public class Strings {
    public static void main(String[] args){
        String str1 = new String("Awesome");
        StringBuffer str2 = new StringBuffer("Wonderful");
        String str3 = "Awesome";
        str3.concat(" Java");
        str2=str2.append(" Java");
        System.out.println(str3);//new object is fromed but output will be Awesome
        System.out.println(str2);
        
        // .equals content comparison
        // == reference comparison
        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true
        
        //STRING
        // str.length() gives string's length
        // str.charAt(index) gives cahr at index position of str
        // str.isEmpty() true or false
        // str.replace(oldchar, newchar) works for sequence of char too
        // str.indexOf(char) finds index of first occurence
        // str.lastIndexOf(char) for last occurence
        // str.substring(begIndex,endIndex)
        // str.toLowerCase()
        // str.toUpperCase()
        // str.trim() removes spaces from beginning and end not in middle
        // we can combine them str.trim().toUpperCase()
        
        //STRING BUFFER
        // str.append()
        // str.insert(index where to insert, string to insert)
        // str.delete()
        // str.capacity(); new capacity = (old capacity*2)+2
        // str.length()
        // str.setCharAt(index, ch);
        // str.deleteCharAt(index,ch);
        // str.reverse()
        // str.setLength()
        // str.ensureCapacity(minCapacity);
        
        
        
    }
}
