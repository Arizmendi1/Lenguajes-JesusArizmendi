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
public class ValoresNoNegativosException extends Exception{
    public ValoresNoNegativosException(){
        super ("No acepto valores negativos");
    }
    
}
