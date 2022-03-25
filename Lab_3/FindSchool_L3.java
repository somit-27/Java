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
public class FindSchool_L3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        String[] arr = new String[5];
        int i,SCOPE=0,SENSE=0;
        System.out.println("Enter the reg nos:");
        for(i=0;i<arr.length;i++){
            arr[i] = in.next();
            if((arr[i].substring(2, 5)).equals("BCE")){
                SCOPE++;
            }
            else if((arr[i].substring(2, 5)).equals("BEC")){
                SENSE++;
            }
        }
        System.out.println("The number of students in SCOPE: "+SCOPE);
        System.out.println("The number of students in SENSE: "+SENSE);
    }
}
