/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_vit;
import java.util.Scanner;
/**
 *
 * @author Somit Jain
 */
public class Stud {
    public static void main(String[] args){
        System.out.println("20BDS0181 Somit Jain");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = in.nextInt();
        int i;
        int[] arr = new int[n];
        System.out.println("Enter marks of "+n+" students: ");
        for(i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
