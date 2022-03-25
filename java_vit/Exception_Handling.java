package java_vit;
/*@author Somit Jain*/
public class Exception_Handling {
    public static void main(String[] args) {
        System.out.println("Hi ");
        int i=100,j,k;
        try{
            k=i/0;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());//description
            System.out.println(e);//name desc
            System.out.println(e.toString());//name desc
            e.printStackTrace();//name desc and method info
//            System.out.println("Exception is "+e);
        }
        
//        System.out.println("k value is "+k);
        //str=null mei print karao length NullPointerException
        
//        System.out.println(50/0);
        throw new ArithmeticException("My AE");
        
    }
}
