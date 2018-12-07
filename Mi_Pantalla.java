/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author DIONER
 */
public class Mi_Pantalla extends JTextField {
    public Mi_Pantalla(){
        super("0");
        
    }
    public Mi_Pantalla(String p){
        super(p);
        //setFont(new Font(Ventana.FUENTE_TITULO,Font.BOLD, tamanio));
        setBackground(Color.cyan);
        setForeground(Color.blue);
    }
}
