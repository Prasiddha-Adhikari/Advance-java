package com.mycompany.advjava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InputDialogDemo extends JFrame implements ActionListener {

    Container container;

//    JFrame frame = new JFrame()
    public InputDialogDemo() {
        container = this.getContentPane();
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Event in JTable");
        this.getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        JButton clickme = new JButton("click me");
        
        clickme.addActionListener(this);

        container.add(clickme);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(this, "are you sure to display");
        if (result == 0) {
            System.out.println("yes clicked");
            JOptionPane.showMessageDialog(this, "yes clicked");
        } else if (result == JOptionPane.NO_OPTION) {
            System.out.println("no clicked");
            JOptionPane.showMessageDialog(this, "no clicked");
        } else if (result == JOptionPane.CANCEL_OPTION) {
            System.out.println("Cancelled clicked");
            JOptionPane.showMessageDialog(this, "cancel clicked");
        }

    }
    public static void main(String[] args) {
        new InputDialogDemo();
    }
}
