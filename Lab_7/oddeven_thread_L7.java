package Lab_7;
import java.util.Scanner;
/* @author Somit Jain*/
class odd extends Thread{
    int[] arr = {23,54,65,83,16,97};
    public void run(){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
                System.out.println("T1");
            }
        }
        System.out.println("Total odd numbers: "+count);
    }
}
class even extends Thread{
    int[] arr = {23,54,65,83,16,97};
    public void run(){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
                System.out.println("T2");
            }
        }
        System.out.println("Total even numbers: "+count);
    }
}
public class oddeven_thread_L7 {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        even eve = new even();
        odd od = new odd();
        Thread  t1 = new Thread(eve);
        Thread t2 = new Thread(od);
        t1.start();
        t2.start();
    }
}
