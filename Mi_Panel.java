/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author DIONER
 */
public class Mi_Panel extends JPanel {
     
    private URL url = getClass().getResource("/Imagen/Tingo_Maria.jpg");
    Image image = new ImageIcon(url).getImage();
    public Mi_Panel(){
        super();
    }
    
    public Mi_Panel(LayoutManager layout){
        super(layout);
    }
     
    @Override
    public void paint(Graphics g){
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
    
}
