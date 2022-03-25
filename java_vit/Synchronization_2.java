package java_vit;
class Nobel{
    public static synchronized void winners(String name){//using synchronized first thread1 completed then thread2 //if use static synch then for 2 objects it works sequenec class level block
        for(int i=0;i<5;i++){
            System.out.println(name);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){}
        }
    }
}
class MyThread1 extends Thread{
    Nobel n = new Nobel();
    String name;
    MyThread1(String name,Nobel n){
        this.n=n;
        this.name=name;
    }
    public void run(){
        n.winners(name);
    }
}
class MyThread2 extends Thread{
    Nobel n = new Nobel();
    String name;
    MyThread2(String name,Nobel n){
        this.n=n;
        this.name=name;
    }
    public void run(){
        n.winners(name);
    }
}
public class Synchronization_2 {
    public static void main(String[] args) throws InterruptedException {
        Nobel n1 = new Nobel();
        Nobel n2 = new Nobel();
        MyThread1 t1 = new MyThread1("Alfred",n1);
        MyThread2 t2 = new MyThread2("Yoshua",n2);
        t1.start();
        t2.start();
    }
}
