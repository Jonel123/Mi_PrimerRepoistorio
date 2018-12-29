/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calculadora;

import static java.lang.Math.PI;
import static java.lang.Math.E;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 *
 * @author DIONER
 */
public class Calculadora {
   private Double Memoria1; 
    public static final Double P_I=PI;
    public static final Double EXPONENCIAL=E;

    public Calculadora() {
        this.Memoria1=0.0;
     
    }

    public Calculadora(Double Memoria1) {
        this.Memoria1 = Memoria1;
    }

    public Double getMemoria1() {
        return Memoria1;
    }

    public void setMemoria1(Double Memoria1) {
        this.Memoria1 = Memoria1;
    }

    public Double Restar(Double Memoria1){
         this.Memoria1=Memoria1-this.Memoria1;
        return this.Memoria1*-1D;
    }
    
    public Double Sumar(Double Memoria1){
        this.Memoria1=Memoria1+this.Memoria1;
        return this.Memoria1;
    }
    
    public Double Multiplicar(Double Memoria1){
         if(this.Memoria1 == 0){
            this.Memoria1 = 1.0;
        }
         this.Memoria1=Memoria1*this.Memoria1;
        return this.Memoria1;
    }
    
   public Double Dividir(Double Memoria_1){
      
           
           if(this.Memoria1==0){
               this.Memoria1=1D;
              }         
            this.Memoria1=Memoria_1/this.Memoria1;
             if (Memoria_1==0) {
                     this.Memoria1=0D;
                    }
             return 1/this.Memoria1;
    }
    
   public String Validar_Entrada(String entrada){
       if(entrada.charAt(0)=='0'){
           entrada = entrada.substring(0, entrada.length());                 
       }
       return entrada;
   }
   
   public String RaizCua(Double numero){
       String Raiz;
       if (numero>=0) {      
            Raiz=String.valueOf(Math.sqrt(numero));
       }else{
           Raiz= "ERROR";
       } 
           return Raiz;
       
   }
    
   public String BotonBorrar(String cadena){
          String Cadena;
              Cadena=cadena;
           if (Cadena.length()>0) {
               Cadena=Cadena.substring(0, Cadena.length()-1);
               cadena="";
               }
           return Cadena;
   }
   
   public String BotonBorrarTodo(String Cadena){
       Cadena = "";
       return Cadena;
   }
   public String Inverso(Double numero){
      String invertido="";
       if(numero!=0){
           invertido=String.valueOf(1/numero);
       }else{
           invertido="ERR";
       }
       return invertido;
   }
    public Double CuadradoNumero(Double numero){
       Double cuadrado=numero*numero;
       return cuadrado;
   }
    
   public String BotonSigno(Double numero){
       Double Cambio=-1D;
       Cambio=numero*Cambio;
       
       return String.valueOf(Cambio);
   }
   
   public static boolean ExistePunto(String cadena){
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
   
   public String BotonFactorial(int numero){
     BigInteger resp=new BigInteger("1");
       for (int i = 1; i <= numero; i++) {
         resp=resp.multiply(new BigInteger(Integer.toString(i)));  
       }
       return resp.toString();

       
   }
   public boolean Validar_Numero(String Cadena){
        Double num;
       try {  
           num = Double.parseDouble(Cadena);
             return true;
          } catch (NumberFormatException e) 
              {
               return false;
              }
   }
   
      public boolean Validar_Facto(String Cadena){
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
    

