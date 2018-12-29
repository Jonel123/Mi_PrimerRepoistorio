/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ButtonModel;
import javax.swing.JButton;
/**
 *
 * @author DIONER
 */
public class MiBoton extends JButton {
    private Color color_1 = new Color(0x666f7f);  //color gris mitad arriba del boton 
    private Color color_2 = new Color(0x262d3d);  //color gris oscuro mitad abajo del boton 
    private Color color_3 = new Color(0x038cfc);  //color celeste atras del boton  
    
     public MiBoton(){
         super("Vacio");
        
    }
    public MiBoton(String b){
        super(b);
               
     setFont(new Font(Ventana.FUENTE_BOTON,Font.BOLD ,Ventana.TAMANIO_FUENTE_BOTON));
        
        setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setFocusPainted(false);
        setBorderPainted(false);
         
    }
    @Override
   protected void paintComponent(Graphics g) {
        Color c1,c2,c3;
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
          RenderingHints.VALUE_ANTIALIAS_OFF);
        
           ButtonModel modelo = getModel();

         Paint oldPaint = g2.getPaint();
        if (modelo.isArmed()){        //si el modelo esta armado
           c2=color_1.darker();  // lo hace mas oscuro
           c1=color_2.darker(); //lo hace mas oscuro
           c3=color_3;
        }else{
           c1=color_1.darker();     //lo hace mas oscuro
           c2=color_2.darker();    //lo hace mas oscuro
           c3=color_3.brighter(); //lo hace mas brillante
        }
        if (!modelo.isEnabled()){      //si el modelo esta desabilitado
           c2=color_1.brighter(); //lo hace mas brillante
           c1=color_2.brighter(); //lo hace mas brillante
           c3=color_3.darker();  //lo hace mas oscuro
        }
         RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(
                    0,0,getWidth(),getHeight()-1,20,20);
            g2.clip(r2d);
            g2.setPaint(new GradientPaint(0.0f, 0.0f, c1,  //PINTURA GRADIENTE
                    0.0f, getHeight(), c2));            // OBTENER Altura
            g2.fillRect(0,0,getWidth(),getHeight());   //  OBTENER ANCHO

            g2.setStroke(new BasicStroke(4f));   //ESTABLECER TRAZADO BASICO
            g2.setPaint(new GradientPaint(0.0f, 0.0f, c3,
                    0.0f, getHeight(), c3));
            g2.drawRoundRect(0, 0, getWidth()-2 , getHeight() -2, 18, 18);

        g2.setPaint(oldPaint);
        super.paintComponent(g);
    }

    public Color getColor_1() {
        return color_1;
    }

    public void setColor_1(Color color1) {
        this.color_1 = color1;
    }

    public Color getColor_2() {
        return color_2;
    }

    public void setColor_2(Color color2) {
        this.color_2 = color2;
    }

    public Color getColor_3() {
        return color_3;
    }

    public void setColor_3(Color color3) {
        this.color_3 = color3;
        }
  
}
