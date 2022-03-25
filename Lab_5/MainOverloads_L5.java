/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_5;

import java.util.Scanner;

/**
 *
 * @author Somit Jain
 */
public class MainOverloads_L5 {
    public static void main(double args) {
        
    }
    public static void main(int args) {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Executing in main function with integer arguments");
        System.out.println("Enter array size:");
        int count = 0;
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                    break;
                }
            }
        }
        System.out.println("No of Primes: "+(n-count));
        System.out.println("No of composites: "+count);
    }
    public static void main(float args) {
        
    }
    public static void main(String[] args) {
        MainOverloads_L5.main(5);
    }
}
