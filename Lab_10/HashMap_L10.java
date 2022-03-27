package Lab_10;
/*@author Somit Jain*/
import java.util.*;
public class HashMap_L10 {
    public static void main(String[] args) {
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter n values for student-subjects: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j;
        HashMap<String,String[]> h1 = new HashMap<String, String[]>();
        for(i=0;i<n;i++){
            System.out.println("Enter number of subjects:");
            int num = in.nextInt();
            String[] str = new String[num];
            if(num<3)
                for(j=0;j<num;j++){
                    str[j] = in.next();
                }
            System.out.println("Enter name:");
            String name = in.next();
            h1.put(name, str);
        }
        System.out.println(h1.values());
    }
}
