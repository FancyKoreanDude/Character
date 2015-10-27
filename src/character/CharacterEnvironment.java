/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author EthanChong
 */
class CharacterEnvironment extends Environment {
    
    
    private JungShin myJungShin, myJungShinSmall;

    public CharacterEnvironment() {
        myJungShin = new JungShin(100, 100, 200, 100);
        myJungShinSmall = new JungShin(300, 100, 50, 25);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (myJungShin != null){
            myJungShin.draw(graphics);
        }
        
        if (myJungShinSmall != null){
            myJungShinSmall.draw(graphics);
        }
    }
    
}
