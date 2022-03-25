package Lab_10;
/*@author Somit Jain*/
import java.util.*;
class MyComp implements Comparator<String>{
    public int compare(String a, String b){
        return a.length()-b.length();
    }
}
public class ArrayList_L10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("20BDS0181 Somit Jain");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int i;
        for(i=0;i<n;i++){
            list.add(in.nextLine());
        }
        System.out.println(list);
        MyComp c = new MyComp();
        Collections.sort(list,c);
        System.out.println(list);
        Collections.sort(list,c);
        System.out.println(list);
    }
}
