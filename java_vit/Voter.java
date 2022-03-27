/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_vit;

import java.util.*;
import java.io.*;
/**
 *
 * @author Somit Jain
 */
class aadmi{
    String name,phno,country;
    int age;
}
class naam extends Exception{
    naam(String msg){
        super(msg);
    }
}
class umar extends Exception{
    umar(String msg){
        super(msg);
    }
}
class dig extends Exception{
    dig(String msg){
        super(msg);
    }
}
class desh extends Exception{
    desh(String msg){
        super(msg);
    }
}
public class Voter {
    static void validate(String name, int age, String numb, String count) throws naam,umar,dig,desh{
        if(name.matches("[0-9]")==false){
            throw new naam("Name should not contain numerical values");
        }
        if(age<18){
            throw new umar("Invalid Age");
        }
        if(numb.length()>10){
            throw new dig("Ph No exceeded 10 digits");
        }
        if(count.equals("india")==false){
            throw new desh("Only Indians");
        }
    }
    public static void main(String[] args) throws IOException{
        System.out.println("Enter number of persons:");
        Scanner in = new Scanner(System.in);
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dis = new DataInputStream(System.in);
        int n = in.nextInt();
        System.out.println("ye n hai"+n);
        aadmi[] p = new aadmi[n];
        int i;
        for(i=0;i<n;i++){
            p[i] = new aadmi();
            System.out.println("name");
            p[i].name = inp.readLine();
            System.out.println("age");
            p[i].age = in.nextInt();
            System.out.println("phno");
            p[i].phno = inp.readLine();
            System.out.println("country");
            p[i].country=inp.readLine();
            try{
                validate(p[i].name,p[i].age,p[i].phno,p[i].country);
            }catch(naam | umar | desh | dig naa){
                System.out.println(naa.getMessage());
            }
            
        }
    }
}
