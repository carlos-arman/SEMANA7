/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursoshumanocrud;

import java.sql.SQLException;
import java.util.Scanner;


public class Update {
    Update() throws SQLException{
        Scanner leer = new Scanner(System.in);
        Persona person = new Persona();
        ConexionCRUD cone = new ConexionCRUD();
    
        System.out.println("ACTUALIZAR LOS DATOS");
        
        System.out.println("Ingrese el id registro a modificar: ");
        person.setIdPersona(leer.nextInt());
        
        String tablaBuscar = "tb_contacto";
        String camposBuscar = "id_contacto, nom_contacto, email_contacto, tel_contacto";
        String condicionBuscar = "id_contacto = " + person.getIdPersona();
        cone.actualizarEliminarRegistro(tablaBuscar, camposBuscar, condicionBuscar);
        leer.nextLine();
        System.out.println("Nombre ");
        person.setNomPersona(leer.nextLine());
        
        System.out.println("Correo contacto: ");
        person.setEmailPersona(leer.nextLine());
     
        System.out.println("Telefono ");
        person.setTelPersona(leer.nextLine());
       
        
        
        String tabla ="tb_contacto";
        String nuevosCampos = "nom_contacto = '" + person.getNomPersona() + "',email_contacto = '" + person.getEmailPersona()  + "',tel_contacto = '" + person.getTelPersona() + "'";
        
        cone.actualizarEliminarRegistro(tabla, nuevosCampos, condicionBuscar);
        System.out.println("Modificado");
        
        MenuPrincipal.desplegarMenu();
    }
    
}
