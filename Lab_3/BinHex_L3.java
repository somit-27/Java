/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;

import java.util.*;

/**
 *
 * @author Somit Jain
 */
public class BinHex_L3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter a string:");
        String st = in.next();
        int i;
        System.out.println("The binary form of string is: ");
        string_to_binary(st);
        System.out.println("The hexadecimal form of string is:");
        String hex = string_to_hex(st);
        System.out.println(hex);
        System.out.println("The binary form of hexadecimal form of strings is:");
        hex_to_binary(hex);
    }
	public static void string_to_binary(String s) {
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int val = (int)c;
			String binary = "";
			while(val>0) {
				if(val%2==1) {
					binary += "1";
				}else {
					binary += "0";
				}
				val /= 2;
			}
			binary = reverse(binary);
			System.out.print(binary + " ");
		}
                System.out.println("");
	}
	
	public static String reverse(String s) {
		char a[] = s.toCharArray();
		for(int i=0;i<a.length/2;i++) {
			char temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
		}
		String c = new String(a);
		return c;
	}
	
	public static String string_to_hex(String s) {
		String hex = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int j = (int)c;
			String part = Integer.toHexString(j);
			hex += part;
		}
		        return hex;
	}
	
	public static void hex_to_binary(String s) {
		String binary = "";
		s = s.toUpperCase();
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			switch(c[i]) {
			case '0':
				binary += "0000";
				break;
			case '1':
				binary += "0001";
				break;
			case '2':
				binary += "0010";
				break;
			case '3':
				binary += "0011";
				break;
			case '4':
				binary += "0100";
				break;
			case '5':
				binary += "0101";
				break;
			case '6':
				binary += "0110";
				break;
			case '7':
				binary += "0111";
				break;
			case '8':
				binary += "1000";
				break;
			case '9':
				binary += "1001";
				break;
			case 'A':
				binary += "1010";
				break;
			case 'B':
				binary += "1011";
				break;
			case 'C':
				binary += "1100";
				break;
			case 'D':
				binary += "1101";
				break;
			case 'E':
				binary += "1110";
				break;
			case 'F':
				binary += "1111";
				break;
			}
		}
		System.out.println(binary);
    }
}
