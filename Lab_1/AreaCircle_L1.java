/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

import java.util.Scanner;

/**
 *
 * @author Somit Jain
 */
public class AreaCircle_L1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        float r = in.nextFloat();
        float area = (float) (Math.PI*r*r);
        System.out.println("Area of circle is:"+area);
    }
}
