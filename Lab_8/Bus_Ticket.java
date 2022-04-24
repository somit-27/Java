package Lab_8;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*@author Somit Jain*/
class Bus_Ticket_Reg{
    String BusName;
    int seats;
    Bus_Ticket_Reg(String BusName, int seats){
        this.BusName = BusName;
        this.seats = seats;
    }
    public synchronized void Register_Seats() throws InterruptedException{
        try{
            if(seats==0){
                wait();
            }
            seats--;
        }catch(Exception e){}
    }
    public synchronized void Allot_Seats(int seat){
        this.seats+=seat;
        System.out.println("notified");
        notifyAll();
    }
}
public class Bus_Ticket {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        Bus_Ticket_Reg b1 = new Bus_Ticket_Reg("red",0);
        System.out.println("Enter seats to register from thread 1");
        int n = in.nextInt();
        System.out.println("Enter seats to register from thread 2");
        int n2 = in.nextInt();
        Thread t1 = new Thread(()->{
            try {
                for(int i=0;i<n;i++){
                    b1.Register_Seats();
                    System.out.println("A seat has been registered by t1");
                }
            } catch (InterruptedException ex) {}
           System.out.println(Thread.currentThread().getId());
        });
        Thread t2 = new Thread(()->{
            try {
                for(int i=0;i<n2;i++){
                    b1.Register_Seats();
                    System.out.println("A seat has been registered by t2");
                }
            } catch (InterruptedException ex) {}
            System.out.println("A seat has been registered by t2");
            System.out.println(Thread.currentThread().getId());

        });
        Thread t3 = new Thread(()->{
            b1.Allot_Seats(60);
            System.out.println("New 60 seats are allocated");
            System.out.println(Thread.currentThread().getId());
        });
        Thread t4 = new Thread(()->{
            System.out.println("The remaining seats are "+b1.seats);
        });
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        t4.start();
    }
}
