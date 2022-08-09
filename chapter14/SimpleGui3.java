import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

import java.awt.Color;
import java.awt.event.*;
import java.awt.*;

public class SimpleGui3{
    MyDrawPanel panel;
    MyButtonPanel buttonPanel;
    public static void main(String[] args){
        SimpleGui3 gui = new SimpleGui3();
        gui.go();
    }
    public void go(){
        this.makeFrame();
    }

    public void makeFrame(){
        JFrame frame = new JFrame();
        panel = new MyDrawPanel();
        frame.add(BorderLayout.CENTER, panel);
        buttonPanel = new MyButtonPanel();
        frame.add(BorderLayout.SOUTH, buttonPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

