package java_vit;
/*@author Somit Jain*/
interface Fruits{
    void appearance();
    void color();
}
abstract class FruitsA implements Fruits{
    public void appearance(){
        System.out.println("Appearance FruitsA.......");
    }
}
class FruitsC extends FruitsA{
    public void color(){
        System.out.println("Color FruitsC.......");
    }
}
public class Interface {
    public static void main(String[] args) {
        Fruits a = new FruitsC();
        a.appearance();
        a.color();
    }
}