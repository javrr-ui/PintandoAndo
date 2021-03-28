/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintandoando;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Javi
 */
public class PintandoAndo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }  
        });
    }
    
    public static void createAndShowGUI(){
        
        JFrame frame = new JFrame("Swing paint demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new MiPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
