/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;
import java.util.Scanner;
/**
 *
 * @author Somit Jain
 */
public class Electricity_Bill_L2 {
    public static void main(String[] args){
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter units consumed");
        Scanner in = new Scanner(System.in);
        float unit = in.nextFloat();
        float price = 0;
        while(unit>100){
            if(unit>200){
                price=(float) (price+(unit-200.0)*2.40);
                unit=200;
            }
            else if(unit>150 && unit<=200){
                price=(float) (price+(unit-150)*1.20);
                unit=150;
            }
            else if(unit>100 && unit<=150){
                price=(float) (price+(unit-100)*0.60);
                unit=100;
            }
        }
        price=price+200;
        System.out.println("The total bill will cost: "+price);
    }
}
