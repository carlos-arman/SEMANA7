package recursoshumanocrud;

import java.sql.SQLException;

public class Read {
    public Read () throws SQLException {
        System.out.println("<< CONSULTA DE REGISTROS >>");
        Resultado();
    }
    private void Resultado () throws SQLException {
        try {
            ConexionCRUD mostrar = new ConexionCRUD ();
            
                String tabla = "tb_contacto";
                String camposTabla = "*";
                String condicionBusqueda = "";
                
                mostrar.desplegarRegistros(tabla, camposTabla, condicionBusqueda);
        }catch (SQLException ex){
            System.out.println("Ha ocurrido el siguiente error: " + ex.getMessage());
        }finally{
            MenuPrincipal.desplegarMenu();
        }
    }
}
