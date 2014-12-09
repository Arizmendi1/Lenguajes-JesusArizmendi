/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuardarUsuario;


public class ProbarPersistenciaUsuario {

    public static void main(String[] args) throws Exception {
        
        Usuario u=new Usuario();
        u.setNombre("Panfilo");
        u.setSueldo(20000);
        u.setEdad(40);
        PersistenciaUsuario p=new PersistenciaUsuario();
        p.guardarUsuario(u);
       
    }
    
}
