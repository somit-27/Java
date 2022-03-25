package Lab_6;

import java.util.Scanner;

/*@author Somit Jain*/
class length extends Exception{
    length(String msg){
        super(msg);
    }
}
class space extends Exception{
    space(String msg){
        super(msg);
    }
}
class match extends Exception{
    match(String msg){
        super(msg);
    }
}
class adj extends Exception{
    adj(String msg){
        super(msg);
    }
}
public class Details_L6 {
    static boolean solve(String name,String pass){
        int i;
        for(i=0;i<name.length()-2;i++){
            if(pass.contains(name.substring(i, i+3))){
                return true;
            }
        }
        return false;
    }
    static void validate(String name, String pass, String repass) throws length, space, match, adj{
        if(name.length()<8){
            throw new length("Invalid username length");
        }
        else if(pass.length()<8){
            throw new length("Invalid password length");
        }
        else if(name.contains(" ")){
            throw new space("Username should not contain spaces");
        }
        else if(pass.contains(" ")){
            throw new space("Password should not contain spaces");
        }
        else if(pass.equals(repass)==false){
            throw new match("Passwords don't match");
        }
        else if(solve(name,pass)){
            throw new adj("Password cannot contain username");
        }
        else{
            System.out.println("Account Created");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("20BDS0181");
        System.out.println("Enter username:");
        String username = in.nextLine();
        System.out.println("Enter password:");
        String password = in.nextLine();
        System.out.println("Confirm your password:");
        String repass = in.nextLine();
        try{
            validate(username,password,repass);
        }catch(length|space|match|adj e){
            System.out.println("Exception caught: "+e);
        }
    }
}
