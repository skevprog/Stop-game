/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stop.Game;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Main {
    public static void main(String[] args) {
        
        
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);

            }
        });

    }
   
}