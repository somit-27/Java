package Lab_5;
/*@author Somit Jain*/
import java.util.Scanner;
interface CourseTotal{
    public abstract int Total();
}
interface CourseAverage{
    String Average(int total);
}
class Result implements CourseTotal, CourseAverage{
    Scanner in = new Scanner(System.in);
    int n;
    public int Total(){
        System.out.println("Enter number of subjects");
        int i,sum=0;
        n = in.nextInt();
        int[] marks = new int[n];
        float avg;
        for(i=0;i<n;i++){
            marks[i] = in.nextInt();
            sum+=marks[i];
        }
        return sum;
    }
    public String Average(int total){
        float avg = total/n;
        if(avg>=60){
            return "First";
        }
        else if(avg>=50){
            return "Second";
        }
        else{
            return"Fail";
        }
    }
}
public class Course_L5 {
    public static void main(String[] args) {
        System.out.println("20BDS0181 Somit Jain");
        Result res = new Result();
        int total = res.Total();
        String dis = res.Average(total);
        System.out.println(dis);
    }
}
