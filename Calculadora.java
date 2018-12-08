/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import static java.lang.Math.PI;
import static java.lang.Math.E;
/**
 *
 * @author DIONER
 */
public class Calculadora {
   private Double Memoria1; 
    public static final Double P_I=PI;
    public static final Double Exponencial=E;

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
    
   public Double Dividir(Double Memoria){
    
        if(this.Memoria1== 0){
            this.Memoria1=1.0;
        }
        this.Memoria1 = Memoria/this.Memoria1;        
     
           return 1/this.Memoria1;
     
       
    }
    
   public String Validar_Entrada(String entrada){
       if(entrada.charAt(0)=='0'){
           entrada = entrada.substring(1, entrada.length());                 
       }
       return entrada;
   }
   
   public Double RaizCua(Double numero){
        Double  raiz=Math.sqrt(numero);
        Double SRaiz= raiz;
        
            return SRaiz;
                  
   }
    
   public String BotonBorrar(String Cadena){
       Cadena = Cadena.substring(0,Cadena.length()-1);
       if (Cadena.equals("")) {
           Cadena = "0";
       }
       return Cadena;
   }
   
   public String BotonBorrarTodo(String Cadena){
       Cadena = "0";
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
   
   public long BotonFactorial(int numero){
  if (numero < 0) {
            return 0;
        } else {
            if (numero == 0) {
                return 1;
            }
            else{
                return numero*BotonFactorial(numero-1);
               }
        }

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
    

