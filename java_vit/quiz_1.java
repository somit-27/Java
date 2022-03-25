package java_vit;
import java.util.*;
public class quiz_1
{    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the total number of entries (n)");
        int n=sc.nextInt();
        int y[]=new int[n];
        int x[]=new int[n];
        int s_y,s_x,s_xy,s_x2;
        s_y=s_x=s_xy=s_x2=0;
        System.out.println("Please enter the values (y,x)");
        for(int i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
            x[i]=sc.nextInt();
            s_y+=y[i];
            s_x+=x[i];
            s_xy+=(y[i]*x[i]);
            s_x2+=(x[i]*x[i]);
        }
        double b0= ((s_y*s_x2)-(s_x*s_xy))/(n*s_x2 - (s_x*s_x));
        double b1= (n*(s_xy)-(s_x*s_y))/(n*s_x2 - (s_x*s_x));
        double ynew=0.0;
        
        System.out.println("Please enter the size (x new)");
        int X=sc.nextInt();
        
        ynew=b0 + b1*X;
        
        System.out.println("House Price for a size of "+X+" is: "+ynew);
        
    }
    
}
