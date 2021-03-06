/**
 *Virtual Game Library
 * @author shawkai
 */
import javax.swing.*;

public class S1P6 {
    public static void main(String[] args) {
        boolean cont;
        do {
            cont = false;
            
            String names[] = {
                "define: \"Games\"", 
                "The Dungeon Defender", 
                "Regional Math-a-thon",
                "Natinal Math-a-thon"
            };
            
            int element = Integer.parseInt(
                    JOptionPane.showInputDialog("Which element?"));
            
            String output = "The Name of the Game is:\n";
            output += names[element];
            JOptionPane.showMessageDialog(null, output);
            
            String repeat = JOptionPane.showInputDialog("Again?");
            if(repeat.equals("yes"))
                cont = true;          
        } while(cont);
    }   
}