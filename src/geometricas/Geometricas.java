/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometricas;

/**
 *
 * @author T
 */
public class Geometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Cuadrado c=new Cuadrado();
               c.setLado(10);
               Area a =new Area(c);
          System.out.println(a.Calcular());  
    
    
}
}