/**
 *Crack the Code
 * @author shawkai
 */
import javax.swing.*;
import java.io.*;

public class S1P5 {
    public static void main(String[] args) throws Exception {
        String input;
        input = JOptionPane.showInputDialog(
            "1 to set secret phrase,\n" 
            +"2 to guess the secret phrase"
        );
        File file = new File("password.psswrd");
        
        if(input.equals("1")) {
            String p = JOptionPane.showInputDialog(
                "Enter the secret phrase to set");
            
            FileOutputStream outStream;
            outStream = new FileOutputStream(file);
            PrintWriter out;
            out = new PrintWriter(outStream);
            out.println(p);

            out.flush();
            out.close();
            outStream.close();
        } else {
            
            FileReader fr = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fr);
            
            String password = buffer.readLine();
            
            String userPass;
            userPass = JOptionPane.showInputDialog(
                    "Enter your guess...");
            
            if(password.equals(userPass)) {
                JOptionPane.showMessageDialog(null, "correct!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Wrong =(");
            }               
        }
    }    
}
