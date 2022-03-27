package Lab_10;
/*@author Somit Jain*/
import java.util.*;
class MyComp implements Comparator<String>{
    @Override
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
        System.out.println("Before Sort:");
        System.out.println(list);
        MyComp c = new MyComp();
        Collections.sort(list,c);
        System.out.println("After sort ascending");
        System.out.println(list);
        System.out.println("After sort descending");
        Collections.sort(list,Collections.reverseOrder(c));
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting lexically");
        System.out.println(list);
        Collections.sort(list,Comparator.comparingInt(a->(a.contains("e")?0:1)));
        System.out.println("E sort:");
        System.out.println(list);
    }
}
