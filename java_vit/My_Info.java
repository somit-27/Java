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
public class My_Info {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter your name, reg no and CGPA:");
        String n = in.nextLine();
        String r = in.next();
        float c = in.nextFloat();
        System.out.println("Your name, reg no and cgpa is "+n+", "+r+" and "+c);
    }
}
