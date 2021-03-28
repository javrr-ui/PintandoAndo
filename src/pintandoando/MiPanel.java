/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintandoando;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

/**
 *
 * @author Javi
 */
public class MiPanel extends JPanel{
    
    
    public MiPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
    
    public Dimension getPreferredSize(){
        
        return new Dimension(250,200);
    }
    
    @Override
    public void paintComponent(Graphics g){
      
        super.paintComponent(g);
        
        g.drawString("Panel personalizado XD", 50,50);
    }
}
