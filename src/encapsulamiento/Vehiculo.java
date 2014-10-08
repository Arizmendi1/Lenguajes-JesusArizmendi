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
public class Vehiculo {
    private String marca;
    private int year;
    private float precio;
   
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
  
public String getMarca(){
 return marca;   
}
public int getYear(){
    return year;
}
public float getPrecio(){
    return precio;
}
}

