/**
 *Guess the Password
 * @author shawkai
 */
import javax.swing.*;

public class S1P2 {
    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog("guess the secret phrase");
        if(input.equals("Evil Genius")) {
            System.out.println("You got it right");
        }
        else {
            System.out.println("You got it wrong");
        }
    }    
}
