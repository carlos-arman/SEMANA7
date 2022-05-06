package recursoshumanocrud;

import java.sql.SQLException;
import java.util.Scanner;

public class Create {
    Create() throws SQLException{
        Scanner leer = new Scanner(System.in);
        Persona person = new Persona();
        System.out.println("Nombre: ");
        person.setNomPersona(leer.nextLine());

        System.out.println("Correo electronico: ");
        person.setEmailPersona(leer.nextLine());

        System.out.println("Telefono: ");
        person.setTelPersona(leer.nextLine());

        String tabla = "tb_contacto";
        String camposTabla = "nom_contacto,email.contacto,tel_contacto";
        String ValoresCampos = "" + person.getNomPersona() + "','" + person.getEmailPersona() + "','" + person.getTelPersona() + "'";

        ConexionCRUD utilerias = new ConexionCRUD();

        utilerias.guardarRegistros(tabla, camposTabla, ValoresCampos);

        MenuPrincipal.desplegarMenu();
    }
}
