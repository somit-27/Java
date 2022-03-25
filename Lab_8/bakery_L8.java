package Lab_8;
/*@author Somit Jain*/
class prepare{
    int cakes;
    prepare(int cakes){
        this.cakes = cakes;
    }
    public synchronized void sold(){
        try{
            if(this.cakes==0){
                wait();
            }
            this.cakes--;
            System.out.println(this.cakes);
            System.out.println("A cake has been sold");
        }catch(Exception e){}
    }
    public synchronized void baked(int num){
        try{
            if(this.cakes+num<10){
                this.cakes+=num;
                System.out.println(num+" cakes added");
            }
        }catch(Exception e){}
        notify();
    }
    public synchronized void display(){
        System.out.println("Cakes left: "+this.cakes);
    }
}
public class bakery_L8 {
    public static void main(String[] args) throws InterruptedException {
        prepare p1 = new prepare(10);
        System.out.println("20BDS0181 Somit Jain");
        Thread t1 = new Thread(()->{
            while(p1.cakes!=0){
                p1.sold();
            }
        });
        Thread t2 = new Thread(()->{
            while(p1.cakes!=0){
                p1.sold();
            }
        });
        Thread t3 = new Thread(()->{
            p1.baked(5);
        });
        Thread t4 = new Thread(()->{
            p1.display();
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }
}
