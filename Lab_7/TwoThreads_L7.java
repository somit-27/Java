package Lab_7;
/*@author Somit Jain*/
public class TwoThreads_L7 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("20BDS0181 Somit Jain");
        Thread fact = new Thread(()->{
            int count=0,k,r;
            for(int i=100;i<200;i++){
                count++;
                k=i;
                r=0;
                while(k>0){
                    r=r+(k%10);
                    k=k/10;
                }
                if(i%r==0){
                    System.out.println("Sum of digits is a factor of same number: "+i);
                }
                try{
                    if(count%10==0){
                        Thread.sleep(4000);
                    }
                }catch(InterruptedException e){}
            }
        });
        Thread prime = new Thread(()->{
            int flag=0,count=0;
            for(int i=1;i<100;i++){
                int num=i,sum=0;
                while(num>0){
                    sum=sum+num%10;
                    num=num/10;
                }
                count++;
                flag=0;
                for(int j=2;j<sum-1;j++){
                    if(sum%j==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println("Prime Number:"+i);
                }
                try{
                    if(count%10==0){
                        System.out.println("Both threads ran for 10 numbers each.\n\n");
                        Thread.sleep(4000);
                    }
                }catch(InterruptedException e){};
            }
        });
        fact.start();
        prime.start();
        
    }
}
