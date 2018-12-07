/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author DIONER
 */
public class Mi_Label extends JLabel{

    public Mi_Label() {
        super(" ");
    }
    public Mi_Label(String g, int tamanio){
        super(g);
        setFont(new Font(Ventana.FUENTE_TITULO,Font.BOLD, tamanio));
        setForeground(Ventana.COLOR_TITULO);
    }
}
