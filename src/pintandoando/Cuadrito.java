/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintandoando;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Javi
 */
public class Cuadrito extends JComponent{
    
    private int xPos=50;
    private int yPos=50;
    private int width=20;
    private int height=20;
    
    
    Cuadrito(){
       
    }
    
    
    public void paintCuadro(Graphics g){
        
        g.setColor(Color.red);
        g.fillRect(xPos, yPos, width, height);
        g.setColor(Color.black);
        g.drawRect(xPos,yPos,width,height);
        
    }
    
    public int getX() {
        return xPos;
    }

    public void setX(int xPos) {
        this.xPos = xPos;
    }

    public int getY() {
        return yPos;
    }

    public void setY(int yPos) {
        this.yPos = yPos;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
}
