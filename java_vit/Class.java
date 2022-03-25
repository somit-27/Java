/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_vit;

/**
 *
 * @author Somit Jain
 */
class Person{
    String name = "Somit";
    void set(String name1){
        name=name1;
    }
    void get(){
        System.out.println("The name is "+name);
    }
    void walk(){
        System.out.println("Walking........");
    }
}
public class Class {
    public static void main(String[] args){
        Person pobj = new Person();
        //new Person();
        Person pobj2;
        pobj2 = new Person();
        pobj2.set("Abhi");
        pobj2.get();
        pobj2.walk();
        pobj.get();
    }
}
