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
public class Arrays {
    static void max(int a[]){
        int maxi = a[0];
        for(int i=1;i<a.length;i++){
            if(maxi<a[i]){
                maxi=a[i];
            }
        }
        System.out.println("Maximum is "+maxi);
    }
    public static void main(String[] args){
        System.out.println("Hello");
        //to decalre array
//        int b[]=new int[6];
        int[] a = new int[5];
//        int[] a3 = {40,30,80};
        Scanner in = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i] = in.nextInt();
        }
//        max(a);
        System.out.println("ELemets of array are:");
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        //enhanced for loop
        for(int data:a)
            System.out.print(data+" ");
        
        
        
        //2D Arrays
        int arr1[][] = new int[5][];
        arr1[0][1]=45;
        arr1[1][2]=90;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=in.nextInt();
            }
        }
        
        int arr2[][] = new int[][]{
            new int[]{10,11,12},
            new int[]{13,14},
            new int[]{90,91,92,93}
        };
        int[][] arr3 = new int[][]{
            new int[]{10,11,12},
            new int[]{13,14},
            new int[]{90,91,92,93}
        };
        
        //ANONYMOUS ARRAY
        //array decalred without reference
        max(new int[]{10,11,78,56,23,12});
    }
}
