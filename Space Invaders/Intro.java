/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


/**
 *
 * @author sarra.francesco
 */
class Intro extends Space {

      @Override
        public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.setFont(new Font("Bold", Font.PLAIN, 40));
            g.drawString("Space Invaders", 100, 100);
            g.setFont(new Font("Bold", Font.PLAIN, 10));
            g.drawString("          by Francesco Sarra", 110, 110);            
        }

    void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
