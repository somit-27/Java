package Lab_9;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*@author Somit Jain*/
public class thread_with_files_L9 {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("20BDS0181 Somit Jain");
        File f = new File("C:\\Users\\Somit Jain\\Documents\\NetBeansProjects\\Java_VIT\\src\\Lab_9\\file1.txt");
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        DataInputStream dis = new DataInputStream(fis);
        Thread t1 = new Thread(()->{
            for(int i=2;i<100;i++){
                int j;
                int flag=0;
                for(j=2;j<i/2;j++){
                    if(i%j==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    try {
                        dos.writeInt(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {} 
                    } catch (IOException ex) {}

                }
            }
        });
        File f2 = new File("C:\\Users\\Somit Jain\\Documents\\NetBeansProjects\\Java_VIT\\src\\Lab_9\\file2.txt");
        FileInputStream fis2 = new FileInputStream(f2);
        FileOutputStream fos2 = new FileOutputStream(f2);
        DataOutputStream dos2 = new DataOutputStream(fos2);
        DataInputStream dis2 = new DataInputStream(fis2);
        Thread t2 = new Thread(()->{
            for(int i=101;i<200;i++){
                int j;
                int flag=0;
                for(j=2;j<=i/2;j++){
                    if(i%j==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    try {
                        dos2.writeInt(i);
                        Thread.sleep(1000);
                    } catch (IOException | InterruptedException ex) {}
                }
            }
        });
        Thread t3 = new Thread(()->{
            try {
                while(dis.available()>0){
                    System.out.println(dis.readInt()+"    Thread 3");
                }
            } catch (IOException ex) {}
            
        });
        Thread t4 = new Thread(()->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(thread_with_files_L9.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while(dis2.available()>0){
                    System.out.println(dis2.readInt()+"    Thread 4");
                }
            } catch (IOException ex) {}
            
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
        t4.start();
        t3.join();
        t4.join();
    }
}