/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 *
 * @author DIONER
 */
public class Ventana extends JFrame implements ActionListener{
    
    private Double Resp = 0D;
    private String Operacion = "";
    static final int TAMANIO_FUENTE_TITULO=30;
    static final int TAMANIO_FUENTE_BOTON=12;
    static final Color COLOR_TITULO=new Color(0,0,0);
    static final Color COLOR_FUENTE_BOTON=new Color(8,16,113);
    static final Color COLOR_FONDO_BOTON=new Color(121,132,134);
    static final Color COLOR_FONDO_BOTO=new Color(181,32,13);
     static final String FUENTE_TITULO = "Broadway";
      static final String FUENTE_BOTON = "arial black";
      static final Color COLOR_FONDO_PANEL=new Color(74, 136, 143);
      
       /*CREANDO PANEL*/
    private Mi_Panel Panel=new Mi_Panel();
     
      /*CREANDO TITULO*/
    private Mi_Label Titulo=new Mi_Label(" CALCULADORA",TAMANIO_FUENTE_TITULO);
   
    /*CREANDO PANTALLITA DE IMPRESION*/
    private Mi_Pantalla Pantallita=new Mi_Pantalla("0");
    
    /*CREANDO CALCULO*/
    private Calculadora calculo=new Calculadora();
    
    
    /*CREANDO BOTONES*/
    private MiBoton Boton1=new MiBoton("1");
     private MiBoton Boton2=new MiBoton("2");
      private MiBoton Boton3=new MiBoton("3");
       private MiBoton Boton4=new MiBoton("4");
        private MiBoton Boton5=new MiBoton("5");
         private MiBoton Boton6=new MiBoton("6");
          private MiBoton Boton7=new MiBoton("7");
           private MiBoton Boton8=new MiBoton("8");
            private MiBoton Boton9=new MiBoton("9");
             private MiBoton Boton0=new MiBoton("0");
    private MiBoton Boton_Signo=new MiBoton("±");
     private MiBoton Boton_Punto=new MiBoton(".");
      private MiBoton Boton_Restar=new MiBoton("-");
       private MiBoton Boton_Sumar=new MiBoton("+");
        private MiBoton Boton_Multiplicar=new MiBoton("x");
         private MiBoton Boton_Dividir=new MiBoton("÷");
          private MiBoton Boton_Borrar=new MiBoton("DEL");
           private MiBoton Boton_BorrarTodo=new MiBoton("AC");
            private MiBoton Boton_Inversa=new MiBoton("1/n");
             private MiBoton Boton_Igual=new MiBoton("=");
    private MiBoton Boton_Pi=new MiBoton("π");        
     private MiBoton Boton_Raiz=new MiBoton("√");
      private MiBoton Boton_Potencia=new MiBoton("n^2");
       private MiBoton Boton_Factorial=new MiBoton("n!");
        private MiBoton Boton_Exponencial=new MiBoton("e");
    
public Ventana(){
     //setUndecorated(true);
      setBounds(450, 120, 350, 505);
      setLayout(null);
       setVisible(true);   //Hacer visible la ventana
        setResizable(false); //hace Visible el expandir la ventana
        setMinimumSize(new Dimension(350,505));
            setMaximumSize(new Dimension(350, 505));
            setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
         
          setLayout(new BorderLayout());
          
            Panel.setLayout(null);
                        
            add(Panel);     /*AGREGANDO PANEL A LA VENTANA*/
            
            /*AGRAGANDO OBJETOS DE TIPO TITULO Y PANTALLITA AL PANEL*/
             Panel.add(Titulo);
             Panel.add(Pantallita);
             
             Panel.setBackground(COLOR_FONDO_PANEL);
             Boton_Borrar.setBackground(COLOR_FONDO_BOTO);
             Boton_BorrarTodo.setBackground(COLOR_FONDO_BOTO); 
           
             
             /*COORDENADAS Y TAMAÑO DE TITULO Y PANTALLITA*/
             Titulo.setBounds(30, 10, 280, 50);
             Pantallita.setBounds(10, 60, 325, 30);
       
             /*COORDENADAS Y TAMAÑO DE LOS BOTONES*/
            Boton1.setBounds(10, 325, 60, 65);
             Boton2.setBounds(75, 325, 60, 65);
              Boton3.setBounds(140, 325, 60, 65);
               Boton4.setBounds(10, 250, 60, 65);
                Boton5.setBounds(75, 250, 60, 65);
                 Boton6.setBounds(140, 250, 60, 65);
                  Boton7.setBounds(10, 175, 60, 65);
                   Boton8.setBounds(75, 175, 60, 65);
                    Boton9.setBounds(140, 175, 60, 65);
                     Boton0.setBounds(10, 400, 65, 65);
            Boton_Signo.setBounds(75, 400, 65, 65);
             Boton_Punto.setBounds(140, 400, 65, 65);
              Boton_Restar.setBounds(205, 175, 65, 65);
               Boton_Sumar.setBounds(205, 250, 65, 65);
                Boton_Multiplicar.setBounds(205, 325, 65, 65);
                 Boton_Dividir.setBounds(205, 400, 65, 65);
                  Boton_Borrar.setBounds(270, 100, 65, 65);
                   Boton_BorrarTodo.setBounds(270, 175, 65, 65);
                    Boton_Inversa.setBounds(270, 325, 65, 65);
                     Boton_Igual.setBounds(270, 400, 65, 65);
                Boton_Pi.setBounds(10, 100, 65, 65);
                 Boton_Raiz.setBounds(140, 100, 65, 65);
                  Boton_Potencia.setBounds(270, 250, 65, 65);
                   Boton_Factorial.setBounds(75, 100, 65, 65);    
                    Boton_Exponencial.setBounds(205, 100, 65, 65);
            
       /*PONIENEDO EN ESCUCHA A LOS BOTONES NUMERICOS*/
        Boton1.addActionListener(this);
        Boton2.addActionListener(this);
        Boton3.addActionListener(this);
        Boton4.addActionListener(this);
        Boton5.addActionListener(this);
        Boton6.addActionListener(this);
        Boton7.addActionListener(this);
        Boton8.addActionListener(this);
        Boton9.addActionListener(this);
        Boton0.addActionListener(this);
        
          /*AGREGANDO BOTONES NUMERICOS AL PANEL*/
          Panel.add(Boton1);
           Panel.add(Boton2);
            Panel.add(Boton3);
             Panel.add(Boton4);
              Panel.add(Boton5);
               Panel.add(Boton6);
                Panel.add(Boton7);
                 Panel.add(Boton8);
                  Panel.add(Boton9);
                   Panel.add(Boton0);
           
           /*PONIENEDO EN ESCUCHA A LOS BOTONES DE OPERACIONES*/
          Boton_Signo.addActionListener(this);
          Boton_Punto.addActionListener(this);
          Boton_Restar.addActionListener(this);
          Boton_Sumar.addActionListener(this);
          Boton_Multiplicar.addActionListener(this);
          Boton_Dividir.addActionListener(this);
          Boton_Borrar.addActionListener(this);
          Boton_BorrarTodo.addActionListener(this);
          Boton_Inversa.addActionListener(this);
          Boton_Igual.addActionListener(this);
          Boton_Pi.addActionListener(this);
          Boton_Raiz.addActionListener(this);
          Boton_Potencia.addActionListener(this);
          Boton_Factorial.addActionListener(this);
          Boton_Exponencial.addActionListener(this);
                   
          /*AGREGANDO BOTONES DE OPERACIONES AL PANEL*/  
          Panel.add(Boton_Signo);
           Panel.add(Boton_Punto);
            Panel.add(Boton_Restar);
             Panel.add(Boton_Sumar);
              Panel.add(Boton_Multiplicar);
               Panel.add(Boton_Dividir);
                Panel.add(Boton_Borrar);
                 Panel.add(Boton_BorrarTodo);
                  Panel.add(Boton_Inversa);
                   Panel.add(Boton_Igual);
            Panel.add(Boton_Pi);
             Panel.add(Boton_Raiz);
              Panel.add(Boton_Potencia);
               Panel.add(Boton_Factorial);
                Panel.add(Boton_Exponencial);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         Object Pulsado=ae.getSource();
         boolean op = calculo.Validar_Numero(Pantallita.getText());
          boolean facto = calculo.Validar_Facto(Pantallita.getText());
    
        if(Pulsado.equals(this.Boton1)){
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton1.getText())); 
         }
         
        if(Pulsado.equals(this.Boton2)){
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton2.getText()));  
         }
         
        if(Pulsado.equals(this.Boton3)){
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton3.getText()));  
         }
         
        if(Pulsado.equals(this.Boton4)){
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton4.getText())); 
         }
          
        if(Pulsado.equals(this.Boton5)){
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton5.getText()));  
         }
         
        if(Pulsado.equals(this.Boton6)){
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton6.getText()));
         }
         
        if(Pulsado.equals(this.Boton7)){
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton7.getText()));   
         }
         
        if(Pulsado.equals(this.Boton8)){
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton8.getText())); 
         }
         
        if(Pulsado.equals(this.Boton9)){
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton9.getText())); 
         }
         
        if(Pulsado.equals(this.Boton0)){
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton0.getText()));   
         }
         
        if(Pulsado.equals(this.Boton_Raiz)){ 
            if(op!=false){
                Pantallita.setText(String.valueOf(calculo.RaizCua(Double.parseDouble(Pantallita.getText()))));  
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR, QUE DOMONIOS INGRESASTES "+""
                                               + "\n"+"NO ES POSIBLE REALIZAR LA OPERACION");
                 }
        }  
        if(Pulsado.equals(this.Boton_Borrar)){ 
            Pantallita.setText(calculo.BotonBorrar(Pantallita.getText()));  
         }
          
        if(Pulsado.equals(this.Boton_BorrarTodo)){
            Pantallita.setText(calculo.BotonBorrarTodo(Pantallita.getText())); 
               Boton_Punto.setEnabled(true);
         }
          
        if (Pulsado.equals(this.Boton_Inversa)) {
           if(op!=false){
                String cadena = calculo.Inverso(Double.parseDouble(Pantallita.getText()));
               if (cadena.equals("ERR")) {
                   JOptionPane.showMessageDialog(null, "ERROR, NO EXISTE INVERSA DE CERO");
                }else {
                      Pantallita.setText(cadena);
                      }
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR, QUE DOMONIOS INGRESASTES "+""
                                               + "\n"+"NO ES POSIBLE REALIZAR LA OPERACION");
                 }
        }
        if(Pulsado.equals(this.Boton_Signo)){ 
           if(op!=false){
               Pantallita.setText(calculo.BotonSigno(Double.parseDouble(Pantallita.getText())));   
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR, INGRESE NUMERO VALIDO");
                 }
        }
        if (Pulsado.equals(this.Boton_Factorial)) {
            if(op!=false){
                if(facto!=false){
                Pantallita.setText(String.valueOf(calculo.BotonFactorial(Integer.parseInt(Pantallita.getText()))));
                }else{ 
                    JOptionPane.showMessageDialog(null, "ERROR, NO EXISTE FACTORIAL DE DECIMAL y/o NEGATIVOS");
                     }
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR, QUE DOMONIOS INGRESASTES "+""
                                              + "\n"+"NO ES POSIBLE REALIZAR LA OPERACION");
                 }
        }
        if (Pulsado.equals(this.Boton_Punto)) {
           if(op!=false){
               Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton_Punto.getText()));
               Boton_Punto.setEnabled(false);
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR, INGRESE NUMERO VALIDO");
                 }
           
        }
        if (Pulsado.equals(this.Boton_Potencia)) {
           if(op!=false){
              Pantallita.setText(String.valueOf(calculo.CuadradoNumero(Double.parseDouble(Pantallita.getText()))));
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR, QUE DOMONIOS INGRESASTES "+""
                                                + "\n"+"NO ES POSIBLE REALIZAR LA OPERACION");
                 }
        }
        if (Pulsado.equals(this.Boton_Pi)) {
            Pantallita.setText(String.valueOf(Calculadora.P_I));
        }
        
        if (Pulsado.equals(this.Boton_Exponencial)) {
            Pantallita.setText(String.valueOf(Calculadora.Exponencial));
        }
        
        if (Pulsado.equals(this.Boton_Restar)) {
               Operacion = "-";
            if(op!=false){
               Pantallita.setText((String.valueOf(calculo.Restar(Double.parseDouble(Pantallita.getText())))));
               Pantallita.setText("0");
               Boton_Punto.setEnabled(true);
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR, QUE DOMONIOS INGRESASTES "+""
                                              + "\n"+"NO ES POSIBLE REALIZAR LA OPERACION");
                 }
        }
        
        if (Pulsado.equals(this.Boton_Sumar)) {
               Operacion = "+";
            if(op!=false){
                Resp = ((calculo.Sumar(Double.parseDouble(Pantallita.getText()))));
                Pantallita.setText("0");
                Boton_Punto.setEnabled(true);
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR, QUE DOMONIOS INGRESASTES "+""
                                              + "\n"+"NO ES POSIBLE REALIZAR LA OPERACION");
                 }
        }
        
        if (Pulsado.equals(this.Boton_Multiplicar)) {
               Operacion = "X";
            if(op!=false){
                Resp = (calculo.Multiplicar(Double.parseDouble(Pantallita.getText())));
                Pantallita.setText("0");
                Boton_Punto.setEnabled(true);
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR, QUE DOMONIOS INGRESASTES "+""
                                              + "\n"+"NO ES POSIBLE REALIZAR LA OPERACION");
                 }
        }
        
        if (Pulsado.equals(this.Boton_Dividir)) {
                Operacion = "/";
            if(op!=false){  
                Resp = (calculo.Dividir(Double.parseDouble(Pantallita.getText())));
                Pantallita.setText("0");
                Boton_Punto.setEnabled(true);
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR, QUE DOMONIOS INGRESASTES "+""
                                               + "\n"+"NO ES POSIBLE REALIZAR LA OPERACION");
                 }
        }
             
        if (Pulsado.equals(this.Boton_Igual)) { 
          if(op!=false){
            if (Operacion.equals("+")) {
                Resp = calculo.Sumar(Double.parseDouble(Pantallita.getText()));
                Pantallita.setText(String.valueOf(Resp));
                calculo = new Calculadora();
                Operacion = ""; 
            } 
            
            if (Operacion.equals("-")) {
                Resp = calculo.Restar(Double.parseDouble(Pantallita.getText()));
                Pantallita.setText(String.valueOf(Resp));
                calculo = new Calculadora();
                Operacion ="";
            }
            if (Operacion.equals("/")) {
                Resp = calculo.Dividir(Double.parseDouble(Pantallita.getText()));
                 if (!(Double.isFinite(Resp))) {
                     JOptionPane.showMessageDialog(null, "ERROR, NO ES POSIBLE DIVIDIR ENTRE CERO");
                     } else {
                           Pantallita.setText(String.valueOf(Resp));
                            }
                      calculo = new Calculadora();
                      Operacion = "";            
            }
            if (Operacion.equals("X")) {
                Resp = calculo.Multiplicar(Double.parseDouble(Pantallita.getText()));
                Pantallita.setText(String.valueOf(Resp));
                calculo = new Calculadora();
                Operacion = "";
            }
            Boton_Punto.setEnabled(true);

        }else{
             JOptionPane.showMessageDialog(null, "ERROR, INGRESE NUMERO VALIDO");
             }
    }
  }
    
}       
        
        
    
    
    

