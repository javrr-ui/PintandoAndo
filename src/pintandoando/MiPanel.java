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
    
    private Cuadrito cuadro = new Cuadrito();
    
    public MiPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
        
        addMouseListener(new MouseAdapter(){
            
            @Override
            public void mousePressed(MouseEvent e){
                
                moveSquare(e.getX(),e.getY());
            }
            
        
        });
        
        addMouseMotionListener(new MouseAdapter() {
            
            @Override
            public void mouseDragged(MouseEvent e){
                moveSquare(e.getX(),e.getY());
            }
        
        });
    }
    
    private void moveSquare(int x, int y){
        
        final int CURR_X = cuadro.getX();
        final int CURR_Y = cuadro.getY();
        final int CURR_W = cuadro.getWidth();
        final int CURR_H = cuadro.getHeight();
        
        int OFFSET = 1;
        if(CURR_X!=x||CURR_Y!=y){
            
            // The square is moving, repaint background 
            // over the old square location. 
            repaint(CURR_X,CURR_Y,CURR_W+OFFSET,CURR_H+OFFSET);
            
            //Update coordenates
            cuadro.setX(x);
            cuadro.setY(y);
            //Repaint the square at the new location
            repaint(cuadro.getX(),cuadro.getY(),cuadro.getWidth()+OFFSET,cuadro.getHeight()+OFFSET);
        }
    }
       
    
    public Dimension getPreferredSize(){
        
        return new Dimension(250,200);
    }
    
    @Override
    public void paintComponent(Graphics g){
      
        super.paintComponent(g);
        
        g.drawString("Panel personalizado", 75,15);
        
        //rectangulo
        cuadro.paintCuadro(g);
       
    }
}
