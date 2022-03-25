/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;
import java.util.Scanner;
/**
 *
 * @author Somit Jain
 */
public class CountWord_L3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter a sentence:");
        int count=0;
        String sen = in.nextLine();
        String[] arr = sen.split(" ");
        for(String word:arr){
            if(word.contains("VIT")){
                count++;
            }
        }
        if(count!=0)
        System.out.println("The number of times VIT occurred is: "+count);
        else
            System.out.println("No such word in the sentence.");
    }
}
