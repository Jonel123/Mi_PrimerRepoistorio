/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.Font;
import javax.swing.JButton;
/**
 *
 * @author DIONER
 */
public class MiBoton extends JButton {
    
     public MiBoton(){
         super("Vacio");
        
    }
    public MiBoton(String b){
        super(b);
               
        setFont(new Font(Ventana.FUENTE_BOTON,Font.BOLD ,Ventana.TAMANIO_FUENTE_BOTON));
        setForeground(Ventana.COLOR_FUENTE_BOTON);
        setBackground(Ventana.COLOR_FONDO_BOTON);
              
    }
  
}
