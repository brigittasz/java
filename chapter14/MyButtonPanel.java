import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonPanel extends JPanel implements ActionListener {
    private JButton button;

    public MyButtonPanel(){
        this.addButton();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.green);
    }
    public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked!");
    }
    public void addButton(){
        //create new button
        button = new JButton("click me");
        //add button action listener
        button.addActionListener(this);
        this.add(button);
    }
}