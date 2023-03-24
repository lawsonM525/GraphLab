import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    
    MyPanel(){

        this.setPreferredSize(new Dimension(500, 500));
    }

    //The following paint function draws elements to form a face
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        //face circle
        g2D.setColor(Color.pink);
        g2D.fillOval(100, 100, 300, 300);

        // eye whites
        g2D.setColor(Color.white); 
        g2D.fillOval(150, 150, 50, 50);
        g2D.fillOval(300, 150, 50, 50);

        // eye pupils
        g2D.setColor(Color.black);
        g2D.fillOval(160, 160, 30, 30);
        g2D.fillOval(310, 160, 30, 30);

        // mouth
        g2D.setColor(Color.red);
        g2D.setStroke(new BasicStroke(5));
        g2D.drawArc(150, 250, 200, 100, 180, 180);
        
    }


}
