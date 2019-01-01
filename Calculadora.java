/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calculadora;

import static java.lang.Math.PI;
import static java.lang.Math.E;
import java.math.BigInteger;
/**
 *
 * @author DIONER
 */
public class Calculadora { 
    public static final Double P_I=PI;
    public static final Double EXPONENCIAL=E;

    public  String Operaciones(String Memoria_1, String Memoria_2, String Signo){ //METODO PARA HACER LAS OPERACIONES ARITMETICAS
       Double Resultado=0D;
       String Respuesta;
        if (Signo.equals("-")) {
            Resultado=Double.parseDouble(Memoria_1)-Double.parseDouble(Memoria_2); 
        }
        if (Signo.equals("+")) {
            Resultado=Double.parseDouble(Memoria_1)+Double.parseDouble(Memoria_2); 
        }
         if (Signo.equals("X")) {
            Resultado=Double.parseDouble(Memoria_1)*Double.parseDouble(Memoria_2); 
        }
          if (Signo.equals("/")) {
            Resultado=Double.parseDouble(Memoria_1)/Double.parseDouble(Memoria_2);             
        }
          Respuesta=Resultado.toString();
          return Respuesta;
   }
    
   public String Validar_Entrada(String entrada){ //METODO VALIDAR ENTRADA CONCATENA LA ENTRADA DE DATOS EN LA PANTALLA DE LA CALCULADORA
       if(entrada.charAt(0)=='0'){
           entrada = entrada.substring(0, entrada.length());                 
       }
       return entrada;
   }
   
   public String RaizCua(Double numero){ //METODO PARA PARA SACAR LA RAIZ CUADRADA DE UN  NUMERO
       String Raiz;
       if (numero>=0) {      
            Raiz=String.valueOf(Math.sqrt(numero));
       }else{
           Raiz= "ERROR";
       } 
           return Raiz;
       
   }
    
   public String BotonBorrar(String cadena){ //METODO PARA BORRAR LA PANTALLA DE LA CALCULADORA DE MANERA DESCENDENTE
          String Cadena;
              Cadena=cadena;
           if (Cadena.length()>0) {
               Cadena=Cadena.substring(0, Cadena.length()-1);
               cadena="";
               }
           return Cadena;
   }
   
   public String BotonBorrarTodo(String Cadena){  //METODO PARA BORRAR TODA LA PANTALLA DE LA CALCULADORA
       Cadena = "";
       return Cadena;
   }
   
   public String Inverso(Double numero){ //METODO PARA SACAR LA INVERSA DE UN NUMERO
      String invertido="";
       if(numero!=0){
           invertido=String.valueOf(1/numero);
       }else{
           invertido="ERR";
       }
       return invertido;
   }
    public Double CuadradoNumero(Double numero){ //METODO PARA ELEVAR AL CUADRADO A UN NUMERO
       Double cuadrado=numero*numero;
       return cuadrado;
   }
    
   public String BotonSigno(Double numero){ //METODO PARA PARA PONER SIGNO A UN NUMERO
       Double Cambio=-1D;
       Cambio=numero*Cambio;
       
       return String.valueOf(Cambio);
   }
   
   public boolean ExistePunto(String cadena){ //METODO PARA COLOCAR UN PUNTO DECIMAL AL NUMERO INGRESADO 
        boolean Resultado;
        Resultado=false;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")) {
                Resultado=true;
                break;
            }
        }
        return Resultado;
    }
   
   public String BotonFactorial(int numero){ //METODO PARA SACRA EL FACTORIAL DE UN NUMERO INGRESADO
     BigInteger resp=new BigInteger("1");    //BIGINTEGER PARA HACER LAS OPERACIONES CON NUMEROS GRANDES 
       for (int i = 1; i <= numero; i++) {
         resp=resp.multiply(new BigInteger(Integer.toString(i)));  
       }
       return resp.toString();

       
   }
   public boolean Validar_Numero(String Cadena){  //METODO PARA VALIDAR LA ENTRADA DE SOLO NUMEROS DECIMALES Y NO CARACTERES
        Double num;
       try {  
           num = Double.parseDouble(Cadena);
             return true;
          } catch (NumberFormatException e) 
              {
               return false;
              }
   }
   
      public boolean Validar_Facto(String Cadena){ //METODO PARA VALIDAR LA ENTRADA DE SOLO NUMEROS ENTEROS Y NO CARACTERES
       int num;
       try {  
           num = Integer.parseInt(Cadena);
             return true;
            
          } catch (NumberFormatException e) 
              {
               return false;
              }
   }
 
      
}
    

