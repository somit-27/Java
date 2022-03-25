/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_5;
import java.util.*;
/**
 *
 * @author Somit Jain
 */
class school{
	String name;
	String id;
	Scanner input = new Scanner(System.in);
	public void getDetails() {
		System.out.println("Enter school name");
		name = input.next();
		System.out.println("Enter school id");
		id = input.next();
	}
	
	public class department{
		String dname,did,ns;
		public void getDetails() {
			System.out.println("Enter the department name");
			dname = input.next();
			System.out.println("Enter the department id");
			did = input.next();
			System.out.println("Enter the number of students");
			ns = input.next();
		}
	}
	public void display(department d[]) {
		System.out.println("School name: "+name);
		System.out.println("School id: "+id);
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i].did);
			System.out.println(d[i].dname);
			System.out.println(d[i].ns);
		}
	}
}
public class School_L5 {
    public static void main(String[] args) {
        System.out.println("20BDS0181 Somit Jain");
	school s = new school();
	s.getDetails();
	school.department d[] = new school.department[3];
	for(int i=0;i<d.length;i++) {
            d[i] = s.new department();
            d[i].getDetails();
	}
	s.display(d);
    }
}
