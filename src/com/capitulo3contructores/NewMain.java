/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo3contructores;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula p=new Pelicula("Pelicula dracula con duracion de ",120);
        
        System.out.println(p.getTitulo());
        System.out.println(p.getDuracion());
       
        // TODO code application logic here
    }
    
}
