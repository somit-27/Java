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
public class Accidents_avg_and_diff {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of accidents:");
        int n = in.nextInt();
        float avg = 0;
        float[] arr=new float [n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextFloat();
            avg=avg+arr[i];
        }
        avg=avg/n;
        System.out.println("The average is "+avg);
        System.out.println("Difference is: ");
        for(int i=0;i<n;i++){
            System.out.println(Math.abs(arr[i]-avg));
        }
    }
}
