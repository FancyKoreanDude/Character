/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author EthanChong
 */
public class JungShin {
    
    public void draw(Graphics graphics){
        graphics.drawRect(x, y, width, height);
        
        graphics.fillOval(100, 100, 100, 100);
        graphics.drawOval(110, 130, 34, 34);
        graphics.fillOval(116, 136, 22, 22);
        graphics.drawOval(156, 130, 34, 34);
        graphics.fillOval(162, 136, 22, 22);
        graphics.drawLine(150, 158, 150, 163);
        graphics.drawLine(150, 163, 146, 163);
        graphics.drawLine(150, 168, 146, 163);
        
        
        int[] xS = new int[3];
        xS[0] = x + (width / 2);
        xS[1] = x;
        xS[2] = x + width;
        
        int[] yS = new int[3];
        yS[0] = y;
        yS[1] = y + width * 4 / 3;
        yS[2] = y + width * 2;
        
        graphics.fillPolygon(xS, yS, 3);
    }
    
    public JungShin(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
    
    
    private int x;
    private int y;
    private int height;
    private int width;
}
