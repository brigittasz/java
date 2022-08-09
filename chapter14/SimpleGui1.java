import javax.swing.*;

public class SimpleGui1{
    public static void main(String[] args){
        //Make a frame
        JFrame frame = new JFrame();
        //Make a widget(button, textfield)
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Add the widget to the frame
        frame.getContentPane().add(button);

        frame.setSize(300, 300);

        frame.setVisible(true);
    }
}