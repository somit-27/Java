package java_vit;
/*@author Somit Jain*/
class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
//class Mt extends Thread{
//    void run(){
//        
//    }
//}
//All the above Thread code is in anonymous class ()->
public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter();
        Thread t1 = new Thread(()->{
           for(int i=0;i<5;i++){
               try{
                   Thread.sleep(100);
               }catch(InterruptedException e){}
               c1.increment();
           } 
        });
        Thread t2;
        t2 = new Thread(()->{
            for(int i=0;i<5;i++){
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){}
                c1.increment(); 
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c1.count);
    }
}
