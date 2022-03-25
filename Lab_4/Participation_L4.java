package Lab_4;
import java.util.Scanner;
/*@author Somit Jain*/
class Participants{
    String name,branch,uni,Phno;
    static String test_class;
    public String display(){
        return name+" "+Phno;
    }
    public static void result(String tc,String detail) {
        System.out.println(detail);
        switch(tc){
            case "L1":
                System.out.println("Full Internship and Full Job");
                break;
            case "L2":
                System.out.println("Full Internship and Job on internship");
                break;
            case "L3":
                System.out.println("Full Internship and Job on internship");
                break;
            case "L4":
                System.out.println("Part time Internship of 21 days");
                break;
            case "L5":
                System.out.println("Part time Internship of 21 days");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
public class Participation_L4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter number of students:");
        int n = in.nextInt();
        // in.nextInt();
        Participants[] par = new Participants[n];
        int i;
        for(i=0;i<n;i++){
            par[i] = new Participants();
            System.out.println("Name:");
            par[i].name = in.next();
            System.out.println("Phone number:");
            par[i].Phno = in.next();
            System.out.println("Branch:");
            par[i].branch = in.next();
            System.out.println("University:");
            par[i].uni = in.next();
            System.out.println("Test Class L1,L2,L3,L4 or L5:");
            Participants.test_class = in.next();
            Participants.result(Participants.test_class,par[i].display());
        }
    }
}