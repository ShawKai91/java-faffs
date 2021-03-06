/**
 *Radical Racing-The Track
 * @author shawkai
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class G1P1 extends JFrame {
    final int Width = 900, Height = 650;
    
    // rectangles for the left right top bottom & center
    Rectangle left = new Rectangle(0,0, Width/9,Height);
    Rectangle right = new Rectangle((Width/9)*8,0, Width/9,Height);
    Rectangle top = new Rectangle(0,0, Width,Height/9);
    Rectangle bottom = new Rectangle(0,(Height/9)*8, Width,Height/9);
    Rectangle center = new Rectangle(
            (int) ((Width/9)*2.5),(int) ((Height/9)*2.5),
            (int) ((Width/9)*5),(Height/9)*4);
    
    // obstacles
    Rectangle obstacle = new Rectangle(
            Width/2,(int) ((Height/9)*7), Width/10,Height/9);
    Rectangle obstacle2 = new Rectangle(
            Width/3,(int) ((Height/9)*5), Width/10,Height/4);
    Rectangle obstacle3 = new Rectangle(
            2*(Width/3),(int) ((Height/9)*5), Width/10,Height/4);
    Rectangle obstacle4 = new Rectangle(Width/3,Height/9, Width/10,Height/9);
    Rectangle obstacle5 = new Rectangle(
            Width/2,(int) ((Height/9)*1.5), Width/30,Height/4);
    
    // finish line
    Rectangle finish = new Rectangle(
            Width/9,(Height/2)-Height/9, (int) ((Width/9)*1.5),Height/70);
    // starting lines
    Rectangle lineO = new Rectangle(
            Width/9,Height/2, (int) ((Width/9)*1.5)/2,Height/140);
    Rectangle lineI = new Rectangle(
            ((Width/9)+((int) ((Width/9)*1.5)/2)),(Height/2)+(Height/10),
            (int) ((Width/9)*1.5)/2,Height/140);
            
    public G1P1() {
        super("Radical Racing");
        setSize(Width,Height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // draw BG
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0, Width,Height);
        // border color
        g.setColor(Color.GREEN);
        // draw rectangles
        g.fillRect(left.x,left.y, left.width,left.height);
        g.fillRect(right.x,right.y, right.width,right.height);
        g.fillRect(top.x,top.y, top.width,top.height);
        g.fillRect(bottom.x,bottom.y, bottom.width,bottom.height);
        g.fillRect(center.x,center.y, center.width,center.height);
        
        g.fillRect(obstacle.x,obstacle.y, obstacle.width,obstacle.height);
        g.fillRect(obstacle2.x,obstacle2.y, obstacle2.width,obstacle2.height);
        g.fillRect(obstacle3.x,obstacle3.y, obstacle3.width,obstacle3.height);
        g.fillRect(obstacle4.x,obstacle4.y, obstacle4.width,obstacle4.height);
        g.fillRect(obstacle5.x,obstacle5.y, obstacle5.width,obstacle5.height);
        // starting line 
        g.setColor(Color.WHITE);
        g.fillRect(lineO.x,lineO.y, lineO.width,lineO.height);
        g.fillRect(lineI.x,lineI.y, lineI.width,lineI.height);
        // finish line
        g.setColor(Color.YELLOW);
        g.fillRect(finish.x,finish.y, finish.width,finish.height);
    }
    
    public static void main(String[] args) {
        G1P1 game = new G1P1();
    }  
}