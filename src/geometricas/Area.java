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
public class Area {
   private Cuadrado c;
    public int Calcular(){
   int Area=c.getLado()*c.getLado();
   return Area;
        
    }

    public Area(Cuadrado c) {
        this.c = c;
    }

    public Cuadrado getC() {
        return c;
    }

    public void setC(Cuadrado c) {
        this.c = c;
    }
    
}
