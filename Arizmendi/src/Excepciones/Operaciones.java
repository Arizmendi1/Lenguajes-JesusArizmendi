/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author T107
 */
public class Operaciones {
    public String dividir(int x,int y) throws ValoresNoNegativosException{
        if (x<0||y<0)throw new ValoresNoNegativosException();
        return x/y+"";
    }
}
