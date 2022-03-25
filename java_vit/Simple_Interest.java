package java_vit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Somit Jain
 */
public class Simple_Interest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter principle, rate and time period:");
        float p = in.nextFloat();
        float r = in.nextFloat();
        float t = in.nextFloat();
        System.out.println("The S.I. is "+ p*r*t/100);
    }
}
