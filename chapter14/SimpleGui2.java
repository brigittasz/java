import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

import java.awt.Color;
import java.awt.event.*;
import java.awt.*;

public class SimpleGui2 implements ActionListener{
    private JButton button;
    private JPanel panel;
    private MyDrawPanel graphicsPanel;
    private JFrame graphicsFrame;
    public static void main(String[] args){
        SimpleGui2 gui = new SimpleGui2();
        gui.go();
    }
    public void go(){
        this.makeFrame();
        this.makeGraphicsFrame();
    }
    public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked!");
    }
    public void makeGraphicsFrame(){
        graphicsFrame = new JFrame();
        graphicsPanel = new MyDrawPanel();

        graphicsFrame.add(graphicsPanel);

        //customize frame
        graphicsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphicsFrame.setSize(300, 300);
        graphicsFrame.setVisible(true);
    }
    public void makeFrame(){
        JFrame frame = new JFrame();
        //create new button
        button = new JButton("click me");
        //add button action listener
        button.addActionListener(this);

        frame.getContentPane().add(button);
        panel = new JPanel();
        //sets box layout in Y direction
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //set panel background as green
        panel.setBackground(Color.green);
        //add button to panel
        panel.add(button);
        //add panel to frame
        frame.add(panel);

        
        

        //customize frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
