package java_vit;
import java.util.Scanner;
/*@author Somit Jain*/
abstract class Fruit{
    void taste(){
        System.out.println("Taste...........");
    }
    public abstract void appearance();
    public abstract void color();
}
abstract class FruitA extends Fruit{
    public void appearance(){
        System.out.println("Appearance.......");
    }
}
class FruitC extends FruitA{
    public void color(){
        System.out.println("Color............");
    }
}
class FruitB{
    public void app(){
        System.out.println("app of fruitB......");
    }
}
class FruitD{
    public void app(){
        System.out.println("app of fruitD......");
    }
}
public class AbstractClasses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FruitC o = new FruitC();
        o.taste();
        o.appearance();
        o.color();
        FruitB b = new FruitB();
        FruitD d = new FruitD();
        method(b);
        method(d);
    }
    static void method(FruitB a){
        a.app();
    }
    static void method(FruitD d){
        d.app();
    }
    
    
}
