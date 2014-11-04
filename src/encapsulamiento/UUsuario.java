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
public class UUsuario {
    private int id;
    private String nombre;
    private String email;
    //regla 2 agregar los metodos accesorios (getter´s)
    
  public int getId(){
      return id;
   
  }  
  public String getNombre(){
      return nombre;
  }
  public String getEmail(){

      return email;
//Regla # 3 por cada atributo debemos de crear su metodo mutador (setter´s)
  }
public void setId(int x){
    this.id=id;
}
public void setNombre (String nombre){
    this.nombre=nombre;
}
public void setEmail (String email){
    this.email=email;
}
}

