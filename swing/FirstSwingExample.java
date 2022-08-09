import javax.swing.*;

public class FirstSwingExample{
    public static void main(String[] args){
        JFrame f = new JFrame(); //creating instance of JFrame

        JButton b = new JButton("click");
        b.setBounds(130, 100, 100, 140);

        f.add(b);

        f.setSize(400,500);
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}