/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author Usuario
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pato p1=new Pato();
        p1.setEdad(1);
        p1.hacercuak("Cuak-Cuak");
        System.out.println(p1.getEdad());
        
        // TODO code application logic here
    }
    
}
