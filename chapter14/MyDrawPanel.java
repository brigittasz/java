import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.*;


public class MyDrawPanel extends JPanel {

    public MyDrawPanel(){
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.green);
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
    
}
