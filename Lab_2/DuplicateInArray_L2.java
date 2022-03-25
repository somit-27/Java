/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;
import java.util.Scanner;

/**
 *
 * @author Somit Jain
 */
public class DuplicateInArray_L2 {
    public static void main(String[] args){
        System.out.println("20BDS0181 Somit Jain");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total elements in array:");
        int n = in.nextInt();
        int m = n-1;
        int i;
        int[] arr = new int[n];
        System.out.println("Enter "+n+" sorted elements of array:");
        for(i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Before removing duplicates:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int j=0;
        for(i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println("After sorting:");
        for(i=0;i<j+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
