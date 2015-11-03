/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author EthanChong
 */
public class Human {
    
    public void draw(Graphics graphics){
        graphics.drawRect(x, y, width, height);
        
        
        graphics.setColor(Color.black);
        graphics.drawOval(100, 100, 100, 100);
        graphics.drawOval(100, 123, 45, 45);
        graphics.drawOval(155, 123, 45, 45);
        graphics.setColor(Color.black);
        graphics.fillOval(117, 140, 10, 10);
        graphics.fillOval(173, 140, 10, 10);
        graphics.drawLine(130, 178, 170, 178);
        graphics.drawArc(135, 173, 10, 10, 180, 180);
        graphics.drawArc(145, 173, 10, 10, 180, 180);
        graphics.drawArc(155, 173, 10, 10, 180, 180);
        graphics.drawArc(130, 198, 10, 50, 90, 180);
        graphics.drawArc(160, 198, 10, 50, 270, 180);
        graphics.drawLine(135, 210, 135, 255);
        graphics.drawLine(165, 210, 165, 255);
        graphics.drawArc(135, 230, 15, 50, 180, 180);
        graphics.drawArc(150, 230, 15, 50, 180, 180);
        
//        graphics.drawOval(x, y, width, height);
//        graphics.drawOval(100, 100, 100, 100);
//        graphics.setColor(new Color(255,229,204));
//        graphics.fillOval(100, 100, 100, 100);
//        graphics.setColor(Color.black);
//        graphics.drawOval(110, 130, 34, 34);
//        graphics.setColor(Color.white);
//        graphics.fillOval(110, 130, 34, 34);
//        graphics.setColor(Color.black);
//        graphics.fillOval(116, 136, 22, 22);
//        graphics.drawOval(156, 130, 34, 34);
//        graphics.setColor(Color.white);
//        graphics.fillOval(156, 130, 34, 34);
//        graphics.setColor(Color.black);
//        graphics.fillOval(162, 136, 22, 22);
//        graphics.drawLine(150, 158, 150, 163);
//        graphics.drawLine(150, 163, 146, 163);
//        graphics.drawLine(150, 168, 146, 163);
        
        
        
        
        
//        int[] xS = new int[3];
//        xS[0] = x + (width / 2);
//        xS[1] = x;
//        xS[2] = x + width;
//        
//        int[] yS = new int[3];
//        yS[0] = y;
//        yS[1] = y + width * 4 / 3;
//        yS[2] = y + width * 2;
//        
//        graphics.fillPolygon(xS, yS, 3);
        
//        if (design) {
//            grid.paintComponent(graphics);
//        }
    }
    
    public Human(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        
//        grid = new Grid(ROWS, COLUMNS, width / ROWS, height / COLUMNS, new Point(x, y), Color.BLUE);
//        
//        design = true;
    }
    
    
    private int x;
    private int y;
    private int height;
    private int width;
    
    
//    private Grid grid;
//    private static final int ROWS = 10;
//    private static final int COLUMNS = 20;
//    
//    private boolean design = false;
}
