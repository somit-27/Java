package Lab_8;
import java.util.Scanner;
/*@author Somit Jain*/
class Stat{
    String[] items;
    int[] cost;
    Stat(String[] items, int[] cost){
        this.items=items;
        this.cost=cost;
    }
    public synchronized int remove(String name){
        int i;
        for(i=0;i<items.length;i++){
            if(items[i].compareTo(name)==0){
                return i;
            }
        }
        return 0;
    }
}
public class stationary_L8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] costs = {15,5,6,30,10};
        String[] it = {"Pen","Pencil","Eraser","Sketch","Paper"};
        Stat s1 = new Stat(it,costs);
        System.out.println("Enter an item");
        String str = in.next();
        Thread t1 = new Thread(()->{
            int i;
            i=s1.remove(str);
            s1.items[i]="DONE";
//            int j;
//            for(j=i;j<s1.items.length;j++){
//                s1.items[j]=s1.items[j+1];
//            }
        });
        Thread t2 = new Thread(()->{
            int i;
            i=s1.remove("DONE");
//            int j;
//            for(j=i;j<s1.cost.length;j++){
//                s1.cost[j]=s1.cost[j+1];
//            }
        });
        Thread t3 = new Thread(()->{
            int i;
            i = s1.remove("DONE");
            
        });
        
    }
}
