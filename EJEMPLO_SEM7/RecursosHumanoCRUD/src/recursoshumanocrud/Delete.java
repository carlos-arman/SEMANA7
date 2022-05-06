package recursoshumanocrud;

import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
    Delete() throws SQLException{
        Scanner leer = new Scanner(System.in);
        ConexionCRUD eliminar = new ConexionCRUD();
        System.out.println("<< ELIMINAR REGISTRO  >>");
        
        System.out.println("Ingresar el id del Estudiante");
        String  idEstudianteEliminar = leer.next();
        String tabla = "tb_contacto";
        String campos = "*";
        String condicion = "id_contacto = " + idEstudianteEliminar ;
        eliminar.desplegarRegistros(tabla, campos, condicion);
        
        System.out.println("Precione << A >> para comfirmar: ");
        String confimarBorrar = leer.next();
        
        if("A".equals(confimarBorrar)){
            String valoresCamposNuevos = "";
            
            eliminar.actualizarEliminarRegistro(tabla, valoresCamposNuevos, condicion);
            System.out.println("Registro eliminado correctamente!");
        }
        MenuPrincipal.desplegarMenu();
    }
    
}
