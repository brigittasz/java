package gui;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;


public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        //Code to fill the oval with a random color
        //see page 365 for the code
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }
    
}
