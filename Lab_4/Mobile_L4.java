package Lab_4;
import java.util.Scanner;
/*@author Somit Jain*/
class MobilePhone{
    String model,com_name,price,year;
    void set_mobileDetails(String model, String com_name, String price, String year){
        this.model = model;
        this.com_name = com_name;
        this.price = price;
        this.year = year;
    }
    public static void display_mobileDetails(MobilePhone[] mob){
        int i;
        for(i=0;i<mob.length;i++){
            System.out.println(mob[i].model+" "+mob[i].com_name+" "+mob[i].price+" "+mob[i].year);
        }
    }
    public static void sort_mobileDetails(MobilePhone[] mob) {
        int i,j;
        for(i=0;i<mob.length;i++){
            for(j=0;j<mob.length-i-1;j++){
                if(mob[j].com_name.compareTo(mob[j+1].com_name)>0){
                    MobilePhone temp = mob[j];
                    mob[j]=mob[j+1];
                    mob[j+1]=temp;
                }
            }
        }
    }
    
}
public class Mobile_L4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        int n = 5;
        String mod,com,pr,ye;
        MobilePhone[] mob = new MobilePhone[n];
        for(int i=0;i<n;i++){
            mob[i] = new MobilePhone();
            System.out.println("Mobile model:");
            mod = in.nextLine();
            System.out.println("Company:");
            com = in.nextLine();
            System.out.println("Price:");
            pr = in.nextLine();
            System.out.println("Year launched:");
            ye = in.nextLine();
            mob[i].set_mobileDetails(mod, com, pr, ye);
        }
        MobilePhone.sort_mobileDetails(mob);
        MobilePhone.display_mobileDetails(mob);
    }
}
