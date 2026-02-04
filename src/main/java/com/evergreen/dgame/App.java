package com.evergreen.dgame;

import javax.swing.JFrame;

/**
 *
 * @author maung & bajwa
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello Htoo Khant and Veer Bajwa!");
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");
        
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        
    }
}
