
package Lab_4;

import java.util.Scanner;
/* @author Somit Jain*/
class course{
    String name,ID,Type,Sch;
    static int ue=0,pe=0,pc=0;
    void set_courseDetails(String name, String ID, String Type, String Sch){
        this.name = name;
        this.ID = ID;
        this.Type = Type;
        this.Sch = Sch;
    }
    public static void display_courseDetails(int ue, int pe, int pc){
        System.out.println("There are "+ue+" UE courses, "+pe+" PE courses and "+pc+" PC courses.");
    }
    public static void search_courseDetails(course[] cor){
        for(int i=0;i<cor.length;i++){
            if(cor[i].Type.equals("PC")){
                pc++;
            }
            else if(cor[i].Type.equals("UE")){
                ue++;
            }
            else if(cor[i].Type.equals("PE")){
                pe++;
            }
        }
        display_courseDetails(ue,pe,pc);
    }
}
public class Course_L4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        int n = 3;
        String na,id,type,sch;
        course[] cor = new course[n];
        for(int i=0;i<n;i++){
            cor[i] = new course();
            System.out.println("Enter name of course:");
            na = in.nextLine();
            System.out.println("Enter ID:");
            id = in.nextLine();
            System.out.println("Enter type PE,PC,UE:");
            type = in.nextLine();
            System.out.println("Enter school which offers:");
            sch = in.nextLine();
            cor[i].set_courseDetails(na, id, type, sch);
        }
        course.search_courseDetails(cor);
    }
}
