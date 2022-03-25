/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_5;

import java.util.Scanner;

/* @author Somit Jain*/
abstract class shape{
	double volume;
	public abstract void compute_volume();
	public void show_volume() {
            System.out.println("Volume: "+volume);
	}
}
class sphere extends shape{
	double radius;
	public sphere(double radius) {
            this.radius = radius;
	}
	public void compute_volume() {
            volume = ((double)4/3)*3.14*radius*radius*radius;
            super.show_volume();
	}
	
}
class cylinder extends shape{
	double radius,height;
	public cylinder(double radius,double height) {
            this.radius = radius;
            this.height = height;
	}
	public void compute_volume() {
            volume = 3.14*radius*radius*height;
            super.show_volume();
	}
	
}
class cube extends shape{
	double side;
	public cube(double side) {
            this.side = side;
	}
	public void compute_volume() {
            volume = side*side*side;
            super.show_volume();
	}
	
}
public class Shape_L5 {
    public static void main(String[] args) {
        System.out.println("20BDS0181 Somit Jain");
        Scanner in = new Scanner(System.in);
        System.out.println("Sphere radius:");
        int n = in.nextInt();
        shape sh = new sphere(n);//polymorphism
        sphere s = (sphere)sh;//upcasting
        s.compute_volume();
        System.out.println("Cylinder radius and height");
        n = in.nextInt();
        int h = in.nextInt();
        cylinder c = new cylinder(n,h);
        c.compute_volume();
        System.out.println("Cube side:");
        n = in.nextInt();
        cube cu = new cube(n);
        cu.compute_volume();
    }
}
