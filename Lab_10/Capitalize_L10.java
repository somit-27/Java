package Lab_10;
/*@author Somit Jain*/
import java.util.*;
interface cap{
    String capi(String str);
}
public class Capitalize_L10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        String str = in.nextLine();
        String list[] = str.split(" ");
        cap c = (str1)->{
            return str1.substring(0, 1).toUpperCase()+str1.substring(1);
        };
        for(String i:list){
            System.out.print(c.capi(i)+" ");
        }
    }
}
