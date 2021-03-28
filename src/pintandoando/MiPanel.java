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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;

/**
 *
 * @author Javi
 */
public class MiPanel extends JPanel{
    
    private int squareX = 50;
    private int squareY = 50;
    private int squareW = 20;
    private int squareH = 20;
    
    public MiPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
        
        addMouseListener(new MouseAdapter(){
            
            @Override
            public void mousePressed(MouseEvent e){
                
            }
            
        
        });
        
        addMouseMotionListener(new MouseAdapter() {
            
            @Override
            public void mouseDragged(MouseEvent e){
                
            }
        
        });
    }
       
    
    public Dimension getPreferredSize(){
        
        return new Dimension(250,200);
    }
    
    @Override
    public void paintComponent(Graphics g){
      
        super.paintComponent(g);
        
        g.drawString("Panel personalizado", 75,15);
        
        //rectangulo
        g.setColor(Color.red);
        g.fillRect(squareX, squareY, squareW, squareH);
        g.setColor(Color.black);
        g.drawRect(squareX,squareY,squareW,squareH);
    }
}
