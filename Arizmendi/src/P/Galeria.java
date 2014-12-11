package P;


import java.util.ArrayList;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T107
 */
public class Galeria  {
    ArrayList <imagen> imagenes;

    public Galeria() {
    imagenes=new ArrayList<imagen>();
    imagen i1=new imagen();
    i1.setUrl("/P/Huitzuco.png");
    i1.setTitulo("Huitzuco");
    i1.setDescripcion("Los cazos es una zona colonial ubicada en el municipio de Huitzuco Gro. Zona turistica");
   
    imagen i2=new imagen();
    i2.setUrl("/P/Huitzuco1.png");
    i2.setTitulo("Huitzuco");
    i2.setDescripcion("En huitzuco se practica mucho las actividades equestres teniendo como orgullo un campeon de oro olimpico en Londres hace mas de 80 años");
    
    imagen i3=new imagen();
    i3.setUrl("/P/Huitzuco2.png");
    i3.setTitulo("Huitzuco");
    i3.setDescripcion("Iglesia de Huitzuco Gro. Con mas de 70 años de vida");
   
    imagen i4=new imagen();
    i4.setUrl("/P/Huitzuco3.png");
    i4.setTitulo("Huitzuco");
    i4.setDescripcion("Un pueblo magico de mexico hermoso lago alas Afueras de la ciudad ");
    
    imagen i5=new imagen();
    i5.setUrl("/P/Huitzuco4.png");
    i5.setTitulo("Huitzuco");
    i5.setDescripcion("Vista del centro de Huitzuco Guerrero.");
    
    imagenes.add(i1);
    imagenes.add(i2);
    imagenes.add(i3);
    imagenes.add(i4);
    imagenes.add(i5);
    }
    public ArrayList<imagen> leerTodas (){
        return imagenes;
    }
    public void setImagen (ArrayList<imagen> imagen){
        this.imagenes = imagenes;
    } 
    }
    
