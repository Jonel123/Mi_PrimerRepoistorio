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
   private String Signo;
   private String Memoria_1;
   private String Memoria_2;
    
    static final int TAMANIO_FUENTE_TITULO=30; //ESTABLECIENDO EL TAMAÑO DE LA LETRA DEL TITULO
    static final int TAMANIO_FUENTE_BOTON=13; //ESTABLECIENDO EL TAMAÑO DE LA LETRA DE LOS BOTONES
    static final Color COLOR_TITULO=new Color(0,0,0); //COLOR DE LA LETRA DEL TITULO (NEGRO)
    static final Color COLOR_FONDO_PANEL=new Color(74, 136, 143); //COLOR DE FONDO DEL PANEL
    static final String FUENTE_TITULO = "Broadway";  //TIPO DE LETRA DEL TITULO
    static final String FUENTE_BOTON = "arial black"; //TIPO DE LETRA DE LOS BOTONES
   
      
       /*CREANDO PANEL*/
    private final Mi_Panel Panel=new Mi_Panel();
     
      /*CREANDO TITULO*/
    private final Mi_Label Titulo=new Mi_Label(" CALCULADORA",TAMANIO_FUENTE_TITULO);
   
    /*CREANDO PANTALLITA DE IMPRESION*/
    private final Mi_Pantalla Pantallita=new Mi_Pantalla("");
    
    /*CREANDO CALCULO*/
    private final Calculadora calculo=new Calculadora();
    
    
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
          private MiBoton Boton_Minimizar=new MiBoton("MINIMIZAR");
            private MiBoton Boton_Cerrar=new MiBoton("CERRAR");
           
    
public Ventana(){
     setUndecorated(true); //OCULTA LOS BOTONES CERRAR, MINIMIZAR Y AMPLIAR DE WINDOWS
      setBounds(800, 50, 345, 510);//COORDENADAS DE LA VENTANA 
        setVisible(true);   //HACE VISIBLE LA VENTANA
         setResizable(false); //HACE VISIBLE EL EXPANDIR VENTANA
           setMaximumSize(new Dimension(345, 510)); //TAMAÑO MAXIMO DE LA VENTANA
            setMinimumSize(new Dimension(345,510)); //TAMAÑO MINIMO DE LA VENTANA
             setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE); // SALIR AL CIERRE DE LA VENTANA
              setLayout(new BorderLayout()); // ESTABLECE EL BORDE DEL DISEÑO
      }

 public void Propiedades_Ventana_Principal(){ //TODAS LAS PROPIEDADES EN LA VENTANA CALCULADORA
          
            Panel.setLayout(null); //HACER NULLO PARA AGRAGRA LOS COMPPONENTES AL AL PANEL
                        
            
            /*AGRAGANDO OBJETOS DE TIPO TITULO Y PANTALLITA AL PANEL*/
             Panel.add(Titulo);
             Panel.add(Pantallita);
             
             Panel.setBackground(COLOR_FONDO_PANEL); //COLOR DE FONDO DEL PANEL
           
             
             /*COORDENADAS Y TAMAÑO DE TITULO Y PANTALLITA*/
             Titulo.setBounds(30, 35, 310, 40);
             Pantallita.setBounds(10, 80, 325, 40);

       
             /*COORDENADAS Y TAMAÑO DE LOS BOTONES*/
            Boton1.setBounds(10, 355, 60, 65);
             Boton2.setBounds(75, 355, 60, 65);
              Boton3.setBounds(140, 355, 60, 65);
               Boton4.setBounds(10, 280, 60, 65);
                Boton5.setBounds(75, 280, 60, 65);
                 Boton6.setBounds(140, 280, 60, 65);
                  Boton7.setBounds(10, 205, 60, 65);
                   Boton8.setBounds(75, 205, 60, 65);
                    Boton9.setBounds(140, 205, 60, 65);
                     Boton0.setBounds(10, 430, 65, 65);
            Boton_Signo.setBounds(75, 430, 65, 65);
             Boton_Punto.setBounds(140, 430, 65, 65);
              Boton_Restar.setBounds(205, 205, 65, 65);
               Boton_Sumar.setBounds(205, 280, 65, 65);
                Boton_Multiplicar.setBounds(205, 355, 65, 65);
                 Boton_Dividir.setBounds(205, 430, 65, 65);
                  Boton_Borrar.setBounds(270, 130, 65, 65);
                   Boton_BorrarTodo.setBounds(270, 205, 65, 65);
                    Boton_Inversa.setBounds(270, 355, 65, 65);
                     Boton_Igual.setBounds(270, 430, 65, 65);
                Boton_Pi.setBounds(10, 130, 65, 65);
                 Boton_Raiz.setBounds(140, 130, 65, 65);
                  Boton_Potencia.setBounds(270, 280, 65, 65);
                   Boton_Factorial.setBounds(205, 130, 65, 65);    
                    Boton_Exponencial.setBounds(75, 130, 65, 65);
                    Boton_Minimizar.setBounds(110, 1, 125, 30);
                    Boton_Cerrar.setBounds(235, 1, 110, 30);
            
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
          Boton_Cerrar.addActionListener(this);
          Boton_Minimizar.addActionListener(this);
          //Boton_Maximizar.addActionListener(this);
                   
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
                Panel.add(Boton_Minimizar);
                Panel.add(Boton_Cerrar);
                 
                   add(Panel);     /*AGREGANDO PANEL A LA VENTANA*/
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         Object Pulsado=ae.getSource();
       boolean op = calculo.Validar_Numero(Pantallita.getText()); //CREANDO UN OBJETO DE TIPO BOOLEANO (VERDADERO/FALSO) PARA VALIDAR LA ENTRADA DE SOLO NUMEROS 
       boolean facto = calculo.Validar_Facto(Pantallita.getText()); //CREANDO UN OBJETO DE TIPO BOOLEANO (VERDADERO/FALSO) PARA VALIDAR LA ENTARDA AL BOTON FACTORIAL
          
    if(Pulsado!= Boton_Cerrar || Pulsado!= Boton_Minimizar){
    
        if(Pulsado.equals(this.Boton1)){ //PULASADO AL BOTON 1 
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton1.getText())); //IMPRIME EN LA PANTALLA DE LA CALCULADORA EL NUMERO 1
         }
         
        if(Pulsado.equals(this.Boton2)){ //PULASADO AL BOTON 2 
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton2.getText())); //IMPRIME EN LA PANTALLA DE LA CALCULADORA EL NUMERO 2
         }
         
        if(Pulsado.equals(this.Boton3)){ //PULASADO AL BOTON 3
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton3.getText())); //IMPRIME EN LA PANTALLA DE LA CALCULADORA EL NUMERO 3
         }
         
        if(Pulsado.equals(this.Boton4)){ //PULASADO AL BOTON 4
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton4.getText())); //IMPRIME EN LA PANTALLA DE LA CALCULADORA EL NUMERO 4
         }
          
        if(Pulsado.equals(this.Boton5)){ //PULASADO AL BOTON 5
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton5.getText())); //IMPRIME EN LA PANTALLA DE LA CALCULADORA EL NUMERO 5 
         }
         
        if(Pulsado.equals(this.Boton6)){ //PULASADO AL BOTON 6 
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton6.getText())); //IMPRIME EN LA PANTALLA DE LA CALCULADORA EL NUMERO 6
         }
         
        if(Pulsado.equals(this.Boton7)){ //PULASADO AL BOTON 7 
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton7.getText())); //IMPRIME EN LA PANTALLA DE LA CALCULADORA EL NUMERO 7  
         }
         
        if(Pulsado.equals(this.Boton8)){ //PULASADO AL BOTON 8
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton8.getText())); //IMPRIME EN LA PANTALLA DE LA CALCULADORA EL NUMERO 8
         }
         
        if(Pulsado.equals(this.Boton9)){ //PULASADO AL BOTON 9
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton9.getText())); //IMPRIME EN LA PANTALLA DE LA CALCULADORA EL NUMERO 9
         }
         
        if(Pulsado.equals(this.Boton0)){ //PULASADO AL BOTON 0
             Pantallita.setText(calculo.Validar_Entrada(Pantallita.getText()+Boton0.getText())); //IMPRIME EN LA PANTALLA DE LA CALCULADORA EL NUMERO 0 
         }
         
        if(Pulsado.equals(this.Boton_Raiz)){ //PULSADO AL BOTON RAIZ
            if(Pantallita.getText().equals("")){ //PANTALLA DE LA CALCULADORA VACIA
                   Pantallita.setText("");  //IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
               }else{ //SINO SE REALIZARA LAS OPERCIONES
            if(op!=false){ //SI LA ENTRADA DE DATOS ES DE TIPO NUMERICO
                 String cadena = calculo.RaizCua(Double.parseDouble(Pantallita.getText()));//SE REALIZA LA OPERACION
                  if(cadena.equals("ERROR")){ //SI LA ENTRADA DE DATOS ES NEGATIVO DEVUELVE UN MENSAJE
                          JOptionPane.showMessageDialog(null, "               ES UNA RAIZ IMAGINARIA."+"\n"+
                                                     " POR FAVOR INGRESE NUMEROS POSITIVOS");
                         }else{ //SINO IMPRIME EL RESULTADO CORRECTAMENTE EN LA PANTALLA DE LA CALCULADORA
                              Pantallita.setText(cadena);
                              }
            }else{  //SI LA ENTRADA DE DATOS ES DE TIPO CARACTERES DEVUELVE UN MENSAJE 
                 JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS NO SON VALIDOS,"+""
                                               + "\n"+"  POR FAVOR INGRESE DATOS NUMERICOS");
                 }
           }  
        }
        
        if(Pulsado.equals(this.Boton_Borrar)){ //PULSADO AL BOTON BORRAR  
          Pantallita.setText(calculo.BotonBorrar(Pantallita.getText())); //BORRA LA PANTALLA DE LA CLACULADORA DE MANERA DESCENDENTEMENTE
         }
          
        if(Pulsado.equals(this.Boton_BorrarTodo)){ //PULSADO AL BOTON BORRAR TODO
            Pantallita.setText(calculo.BotonBorrarTodo(Pantallita.getText())); //BORRA TODA LA PANTALLA DE UN SOLO PULSADO
         }
          
        if (Pulsado.equals(this.Boton_Inversa)) { //PULSADO AL BOTON INVERSA (1/n)
            if(Pantallita.getText().equals("")){ //PANTALLA DE LA CALCULADORA VACIA
                   Pantallita.setText("");  //IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
               }else{ //SINO SE REALIZA LAS OPERACIONES
                  if(op!=false){ //SI LA ENTRADA DE DATOS ES DE TIPO NUMERICO
                         String cadena = calculo.Inverso(Double.parseDouble(Pantallita.getText())); //SE REALIZA LA OPERACION
                        if (cadena.equals("ERR")) { //SI LA ENTRADA DE DATOS ES CERO DEVUELVE UN MENSAJE
                           JOptionPane.showMessageDialog(null, "ERROR, NO EXISTE INVERSA DE CERO");
                          }else { //SINO IMPRIME EL RESULTADO CORRECTAMENTE EN LA PANTALLA DE LA CALCULADORA
                               Pantallita.setText(cadena);
                               }
                    }else{//SI LA ENTRADA DE DATOS ES DE TIPO CARACTERES DEVUELVE UN MENSAJE 
                        JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS NO SON VALIDOS,"+""
                                               + "\n"+"  POR FAVOR INGRESE DATOS NUMERICOS");
                 }
            }
        }
        if(Pulsado.equals(this.Boton_Signo)){ //PULSADO AL BOTON SIGNO (±)
            if(Pantallita.getText().equals("")){ //PANTALLA DE LA CALCULADORA VACIA
                Pantallita.setText(""); //IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
                }else{ //SINO SE REALIZA LAS OPERACIONES
                   if(op!=false){ //SI LA ENTRADA DE DATOS ES DE TIPO NUMERICO
                       Pantallita.setText(calculo.BotonSigno(Double.parseDouble(Pantallita.getText()))); //SE REALIZA LA OPERACION   
                   }else{ //SI LA ENTRADA DE DATOS ES DE TIPO CARACTERES DEVUELVE UN MENSAJE 
                      JOptionPane.showMessageDialog(null, "ERROR, INGRESE NUMERO VALIDO");
                       }
                }
        }
        if (Pulsado.equals(this.Boton_Factorial)) { //PULSADO AL BOTON FACTORIAL (n!)
            if(Pantallita.getText().equals("")){ //PANTALLA DE LA CALCULADORA VACIA
                Pantallita.setText(""); //IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
               }else{ //SINO SE REALIZA LAS OPERCIONES
                 if(op!=false){ //SI LA ENTRADA DE DATOS ES DE TIPO NUMERICO
                    if(facto!=false){ //SI LA ENTRADA DE DATOS ES DE NUMEROS ENTEROS Y POSITIVOS
                        Pantallita.setText(String.valueOf(calculo.BotonFactorial(Integer.parseInt(Pantallita.getText())))); //SE REALIZA LA OPERACION
                       }else{ //SI LA ENTRADA DE DATOS ES DE TIPO NEGATIVOS Y DECIMALES DEVUELVE UN MENSAJE
                          JOptionPane.showMessageDialog(null, "ERROR, NO EXISTE FACTORIAL DE DECIMAL y/o NEGATIVOS");
                           }
                }else{ //SI LA ENTRADA DE DATOS ES DE TIPO CARACTERES DEVUELVE UN MENSAJE
                 JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS NO SON VALIDOS,"+""
                                              + "\n"+"  POR FAVOR INGRESE DATOS NUMERICOS");
                     }
                }
        }
        if (Pulsado.equals(this.Boton_Punto)) { //PULSADO AL BOTON PUNTO 
            String Cadena;           
              Cadena=Pantallita.getText();
            if (Cadena.length()<=0) { //SI LA CADENA DE DATOS ES MENOR O IGUAL ACERO
                Pantallita.setText("0."); //SE IMPRIME EL CERO Y EL PUNTO DECIMAL EN LA PANTALLA DE LA CALCULADORA
              }else{ //SI LA CADENA ES MAYOR A CERO 
                 if (!calculo.ExistePunto(Pantallita.getText())) { //SI NO EXITE PUNTO EN LA CADENA
                    Pantallita.setText(Pantallita.getText()+".");  //SE IMPRIME UN PUNTO EN LA CADENA    
                    }
                }       
        }
        if (Pulsado.equals(this.Boton_Potencia)) { //PULSADO AL BOTON POTENCIA (n^2)
            if(Pantallita.getText().equals("")){ //PANTALLA DE LA CALCULADORA VACIA
                   Pantallita.setText(""); //IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
               }else{ //SINO SE REALIZA LAS OPERCIONES
                  if(op!=false){ //SI LA ENTRADA DE DATOS ES DE TIPO NUMERICO
                     Pantallita.setText(String.valueOf(calculo.CuadradoNumero(Double.parseDouble(Pantallita.getText())))); // SE REALIZA LA OPERACION
                     }else{ //SI LA ENTRADA DE DATOS ES DE TIPO CARACTERES DEVUELVE UN MENSAJE
                        JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS NO SON VALIDOS,"+""
                                                + "\n"+"  POR FAVOR INGRESE DATOS NUMERICOS");
                         }
                    }
        }
        if (Pulsado.equals(this.Boton_Pi)) { //PULSADO AL BOTON PI
            Pantallita.setText(String.valueOf(Calculadora.P_I)); //IMPRIME EN LA PANTALLA DE LA CALCULDAORA EL VALOR DE PI
        }
        
        if (Pulsado.equals(this.Boton_Exponencial)) { //PULSADO AL BOTON EXPONENCIAL (e)
            Pantallita.setText(String.valueOf(Calculadora.EXPONENCIAL)); //IMPRIME EN LA PANTALLA DE LA CALCULDAORA EL VALOR DE EXPONENCIAL
        }
        
        if (Pulsado.equals(this.Boton_Restar)) { //PULSADO AL BOTON RESTA
               if(Pantallita.getText().equals("")){ //PANTALLA DE LA CALCULADORA VACIA
                    Pantallita.setText("");  //IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
                  }else{ //SINO SE REALIZA LAS OPERCIONES
                    if(op!=false){  //SI LA ENTRADA DE DATOS ES DE TIPO NUMERICO  SE REALIZA LA OPERACION RESTA
                      Memoria_1=Pantallita.getText();
                      Signo="-";
                      Pantallita.setText("");
                    }else{ //SI LA ENTRADA DE DATOS ES DE TIPO CARACTERES DEVUELVE UN MENSAJE
                        JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS NO SON VALIDOS,"+""
                                              + "\n"+"  POR FAVOR INGRESE DATOS NUMERICOS");
                        }
                   }
        }
        if (Pulsado.equals(this.Boton_Sumar)) { //PULSADO AL BOTON SUMA
             if(Pantallita.getText().equals("")){ //PANTALLA DE LA CALCULADORA VACIA
                   Pantallita.setText("");  //IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
                 }else{ //SINO SE REALIZA LAS OPERCIONES
                    if(op!=false){  //SI LA ENTRADA DE DATOS ES DE TIPO NUMERICO  SE REALIZA LA OPERACION SUMA
                        Memoria_1=Pantallita.getText();
                        Signo="+";
                        Pantallita.setText("");
                    }else{ //SI LA ENTRADA DE DATOS ES DE TIPO CARACTERES DEVUELVE UN MENSAJE
                        JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS NO SON VALIDOS,"+""
                                              + "\n"+"  POR FAVOR INGRESE DATOS NUMERICOS");
                        }
                 }
        }
        if (Pulsado.equals(this.Boton_Multiplicar)) { //PULSADO AL BOTON MULTIPICACION
            if(Pantallita.getText().equals("")){ //PANTALLA DE LA CALCULADORA VACIA
                 Pantallita.setText("");  //IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
               }else{ //SINO SE REALIZA LAS OPERCIONES
                 if(op!=false){  //SI LA ENTRADA DE DATOS ES DE TIPO NUMERICO  SE REALIZA LA OPERACION MULTIPLICACION
                      Memoria_1=Pantallita.getText();
                      Signo="X";
                      Pantallita.setText("");
                    }else{ //SI LA ENTRADA DE DATOS ES DE TIPO CARACTERES DEVUELVE UN MENSAJE
                         JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS NO SON VALIDOS,"+""
                                              + "\n"+"  POR FAVOR INGRESE DATOS NUMERICOS");
                             }
               }
        }
        if (Pulsado.equals(this.Boton_Dividir)) { //PULSADO AL BOTON DIVISION
            if(Pantallita.getText().equals("")){ //PANTALLA DE LA CALCULADORA VACIA
                 Pantallita.setText("");  //IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
               }else{ //SINO SE REALIZA LAS OPERCIONES
                 if(op!=false){  //SI LA ENTRADA DE DATOS ES DE TIPO NUMERICO  SE REALIZA LA OPERACION DIVISION
                    Memoria_1=Pantallita.getText();
                    Signo="/";
                    Pantallita.setText("");
                }else{ //SI LA ENTRADA DE DATOS ES DE TIPO CARACTERES DEVUELVE UN MENSAJE
                    JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS NO SON VALIDOS,"+""
                                               + "\n"+"  POR FAVOR INGRESE DATOS NUMERICOS");
                    }
            }  
        }
        
        if (Pulsado.equals(this.Boton_Igual)) { //PULSADO AL BOTON IGUAL (=)
           if(Pantallita.getText().equals("")){ //PANTALLA DE LA CALCULADORA VACIA
              Pantallita.setText("");  //IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
             }else{ //SINO SE REALIZA LAS OPERCIONES
                 if(op!=false){ //SI LA ENTRADA DE DATOS ES DE TIPO NUMERICO  SE REALIZA LA OPRACION
                   try{ //CAPTURA EL ERROR DE TIPO NULO
                    String Resultado;
                    Memoria_2=Pantallita.getText();
                      if (!Memoria_2.equals("")) { //SI LA PANTALLA DE CALCULDORA CONTIENE DATOS
                          Resultado=calculo.Operaciones(Memoria_1, Memoria_2, Signo); //SE REALIZA LA OPERACION
                          if(Signo.equals("/")){//SI LA OPRACION ES DIVISION 
                             if (Resultado.equals("Infinity")) {//SI EL RESULTADO DE LA DIVISION ES INFINITO DEVUELVE UN MESAJE
                                JOptionPane.showMessageDialog(null, "ERROR, NO ES POSIBLE DIVIDIR ENTRE CERO");
                                    Resultado="0";
                                  }  
                              }
                              Pantallita.setText(Resultado);//IMPRIME EL RESULTADO EN LA PANTALLA DE LA CALCULADORA
                           }
                   }catch(NullPointerException ex){ //CAPTURA EL ERROR DE NULO Y IMPRIME VACIO EN LA PANTALLA DE LA CALCULADORA
                          Pantallita.setText("");
                         }
               }else{  //SI LA ENTRADA DE DATOS ES DE TIPO CARACTERES DEVUELVE UN MENSAJE
                    JOptionPane.showMessageDialog(null, "ERROR, INGRESE NUMERO VALIDO");
                    }
            }
        }
        
        if(Pulsado==Boton_Cerrar){ //PULSADO AL BOTON CERRAR 
             System.exit(DO_NOTHING_ON_CLOSE);// SE CIERRA LA VENTANA CALCULADORA
           }
        if(Pulsado==Boton_Minimizar){//PULSADO AL BOTON MINIMIZAR
            setExtendedState(ICONIFIED); //SE MINIMIZA LA VENTANA CALCULADORA
           }
      }
     }
    
}       
        
        
    
    
    

