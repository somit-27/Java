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
class Faculty{
    String name,ID;
    Faculty(){};
    static class leave{
        static int el=12;
        static int ml=20;
        static int cl=10;
        static void display(){
            System.out.println(el+" "+ml+" "+cl);
        }
    }
}
public class Faculty_L5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter number of faculty:");
        int n = in.nextInt();
        Faculty[] fac = new Faculty[n];
        int i;
        for(i=0;i<n;i++){
            fac[i] = new Faculty();
            System.out.println("Enter name");
            in.nextLine();
            fac[i].name = in.nextLine();
            System.out.println("Enter ID");
            fac[i].ID = in.nextLine();
            System.out.println("Name: "+fac[i].name+"    ID: "+fac[i].ID);
            Faculty.leave.display();
        }
    }
}
