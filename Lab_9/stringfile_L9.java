
package Lab_9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author Somit Jain
 */
public class stringfile_L9 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("20BDS0181 Somit Jain");
        File f = new File("C:\\Users\\Somit Jain\\Documents\\NetBeansProjects\\Java_VIT\\src\\Lab_9\\file1.txt");
        FileInputStream fis = new FileInputStream(f);
        try (FileOutputStream fos = new FileOutputStream(f)){
            String msg = "This file has contents written by Somit Jain 20BDS0181";
            byte b[] = msg.getBytes();
            fos.write(b);
            fos.close();
            byte[] re = new byte[msg.length()];
            fis.read(re);
            StringBuilder rea=new StringBuilder();
            for(byte by:re){
                rea.append((char)by);
            }
            StringBuilder rev = rea.reverse();
            System.out.println(rev);
        }
    }
}
