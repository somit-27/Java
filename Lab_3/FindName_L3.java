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
public class FindName_L3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        String[] arr = new String[5];
        int i,flag=0;
        System.out.println("Enter the names:");
        for(i=0;i<arr.length;i++){
            arr[i] = in.next();
        }
        System.out.println("Enter name to be searched:");
        String name = in.next();
        for(i=0;i<arr.length;i++){
            if(arr[i].contains(name)){
                System.out.println("Name Found");
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Name not found");
        }
    }
}
