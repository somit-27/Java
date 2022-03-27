package Lab_10;
/*@author Somit Jain*/
import java.util.*;
class book{
    String book_name, author,type;
    float price;
    @Override
    public String toString(){
        return ("{Book Name: "+book_name+", Author: "+author+", Price: "+price);
    }
}
class Comparator1 implements Comparator<book>{
    @Override
    public int compare(book o1, book o2) {
        if(o1.book_name.compareTo(o2.book_name)>0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
public class Books_L10 {
    static void print(ArrayList<book> a,ArrayList<book> b,ArrayList<book> c){
        System.out.println("Comic:");
        System.out.println(a.toString());
        System.out.println("Fiction");
        System.out.println(b.toString());
        System.out.println("Cooking:");
        System.out.println(c.toString());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181 Somit Jain");
        System.out.println("Enter number of books:");
        int n = in.nextInt();
        in.nextLine();
        int i;
        book[] b = new book[n];
        for(i=0;i<n;i++){
            b[i] = new book();
            b[i].book_name = in.next();
            b[i].author = in.next();
            b[i].price = in.nextFloat();
            b[i].type = in.next();
        }
        ArrayList<book> fiction = new ArrayList();
        ArrayList<book> comic = new ArrayList();
        ArrayList<book> cooking = new ArrayList();
        for(i=0;i<n;i++){
            System.out.println("hahahha"+b[i].type);
            if(b[i].type.equals("comic")){
                comic.add(b[i]);
            }
            else if(b[i].type.equals("fiction")){
                fiction.add(b[i]);
            }
            else if(b[i].type.equals("cooking")){
                cooking.add(b[i]);
            }
        }
        print(comic,fiction,cooking);
        Comparator1 c = new Comparator1();
        Collections.sort(comic, c);
        Collections.sort(fiction, c);
        Collections.sort(cooking, c);
        System.out.println("After Sorting:");
        print(comic,fiction,cooking);
        Iterator<book> itrc = comic.iterator();
        float min = comic.get(0).price;
        float max = 0;
        while(itrc.hasNext()){
            float temp = itrc.next().price;
            if(temp>max){
                max = temp;
            }
            if(temp<min){
                min = temp;
            }
        }
        System.out.println("Min for Comic: "+min);
        System.out.println("Max for Comic: "+max);
        Iterator<book> itrf = fiction.iterator();
        min = fiction.get(0).price;
        max = 0;
        while(itrf.hasNext()){
            float temp = itrf.next().price;
            if(temp>max){
                max = temp;
            }
            if(temp<min){
                min = temp;
            }
        }
        System.out.println("Min for Fiction: "+min);
        System.out.println("Max for Fiction: "+max);
        Iterator<book> itrco = cooking.iterator();
        min = cooking.get(0).price;
        max = 0;
        while(itrco.hasNext()){
            float temp = itrco.next().price;
            if(temp>max){
                max = temp;
            }
            if(temp<min){
                min = temp;
            }
        }
        System.out.println("Min for Cooking: "+min);
        System.out.println("Max for Cooking: "+max);
    }
}
