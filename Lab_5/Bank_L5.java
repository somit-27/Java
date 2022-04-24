package Lab_5;
/*@author Somit Jain */
interface Bank{
    int roi=12,year=3;
    void show();
}
class Customer{
    String name,ID;
    Customer(String name, String ID){
        this.name = name;
        this.ID = ID;
    }
    void display(){
        System.out.println("Customer Name: "+name);
        System.out.println("Cutomer Id: "+ID);
    }
}
class Account extends Customer implements Bank{
    int accNo, bal,i;
    public Account(String name, String ID,int accNo, int bal) {
        super(name, ID);
        this.accNo = accNo;
        this.bal = bal;
    }
    void interest(){
        System.out.println("Interest: "+bal*roi*year/100);
    }
    @Override
    public void show() {
        System.out.println("Account Number"+ accNo);
        System.out.println("Account Balance: "+bal);
    }
}
public class Bank_L5 {
    public static void main(String[] args) {
        System.out.println("20BDS0181 Somit Jain");
        Account acc = new Account("XYZ","12345678",9876543,5000);
        acc.display();
        acc.show();
        acc.interest();
    }
}
