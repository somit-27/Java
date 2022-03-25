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
public class PassJagged_L3 {
    public static void main(String[] args){
        System.out.println("20BDS0181 Somit Jain");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = in.nextInt();
        int i,j,col;
        int[][] jag_arr = new int[row][];
        for(i=0;i<row;i++){
            int pass_count=0;
            int fail_count=0;
            System.out.println("Enter the column in "+i+"th row:");
            col = in.nextInt();
            jag_arr[i] = new int[col];
            System.out.println("Enter elements of row"+i+":");
            for(j=0;j<jag_arr[i].length;j++){
                jag_arr[i][j] = in.nextInt();
                if(jag_arr[i][j]>=40){
                    pass_count++;
                }
                else{
                    fail_count++;
                }
            }
            System.out.println("The student passed in "+pass_count+" subjects.");
            System.out.println("The student failed in "+fail_count+" subjects.");
        }
        
    }
}
