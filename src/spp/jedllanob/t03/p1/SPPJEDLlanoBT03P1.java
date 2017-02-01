/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jedllanob.t03.p1;
import java.util.*;
/**
 *
 * @author mac
 */
public class SPPJEDLlanoBT03P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double X1,X2,Y1,Y2,h;//Se declaran las variables 
    
       Scanner datos= new Scanner(System.in);//Se llama a scanner
       System.out.println("Escribe el valor para X1");//pedir datos por teclado
        X1= datos.nextDouble();
       System.out.println("Escribe el valor para X2");     
        X2=datos.nextDouble();
       System.out.println("Escribe el valor para Y1");     
        Y1=datos.nextDouble();
       System.out.println("Escribe el valor para ");   
        Y2=datos.nextDouble();
          
        //Proceso 
        h= Math.hypot(X2-X1,Y2-Y1);//Math.hypot es una función que te calcula el valor de la distancia 
        
        System.out.println("La distancia es: " +  h);//te da el resultado
        
        
        
        
    }
}   
