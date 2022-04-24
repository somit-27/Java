package Lab_9;
 import java.io.*;
/*@author Somit Jain*/
public class alphabet_L9{
    public static void main(String[] args) throws FileNotFoundException, IOException {
         System.out.println("20BDS0181 Somit Jain");
        try (FileWriter f = new FileWriter("C:\\Users\\Somit Jain\\Documents\\NetBeansProjects\\Java_VIT\\src\\Lab_9\\filefile.txt")) {
            BufferedWriter bw = new BufferedWriter(f);
            for(char c='A';c<='Z';c++){
                f.write(c);
            }
        }
         FileReader fr = new FileReader("C:\\Users\\Somit Jain\\Documents\\NetBeansProjects\\Java_VIT\\src\\Lab_9\\filefile.txt");
         BufferedReader br = new BufferedReader(fr);
         int i;
         while((i=br.read())!=-1){
             System.out.print((char)i);
         }
         System.out.println("");
         InputStreamReader frr = new InputStreamReader(System.in);
         BufferedReader brr = new BufferedReader(frr);
         char c = '1';
         while(c!='0'){
             c = (char) brr.read();
             if(c!='0' || c!='\n')
                 System.out.println("The letter is "+c);
         }
     }
}
