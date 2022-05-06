/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursoshumanocrud;


import java.sql.*;
/**
 *
 * @author Armando
 */
public class ConexionCRUD {
    private final String servidor = "jdbc:mysql://127.0.0.1/crud";
    private final String usuario = "root";
    private final String clave = "";
    private final String driverConector = "com.mysql.jdbc.Driver";
    private static Connection conexion;
   
    public ConexionCRUD(){
        try{
            
            Class.forName(driverConector);
            conexion = DriverManager.getConnection(servidor, usuario, clave);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion! " + e.getMessage());
        }
     
    }
    public Connection getConnection(){
        return conexion;
    }
    
    public void guardarRegistros(String tabla, String camposTabla, String valoresCampos){
        ConexionCRUD conectar = new ConexionCRUD();
        Connection cone = conectar.getConnection();
        try{
            String sqlQueryStmt = "INSERT INTO " + tabla + "(" + camposTabla + ") VALUES (" + valoresCampos +");";
            Statement stmt;
            stmt = cone.createStatement();
            stmt.executeUpdate(sqlQueryStmt);
            stmt.close();
            cone.close();
            System.out.println("Registro guardado correctamente!");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void actualizarEliminarRegistro(String tabla, String valoresCamposNuevos, String condicion) {
        ConexionCRUD conectar = new ConexionCRUD();
        Connection cone = conectar.getConnection();
        try {
            Statement stmt;
            String sqlQueryStmt;

            if (valoresCamposNuevos.isEmpty()) {
                sqlQueryStmt = "DELETE FROM " + tabla + " WHERE " + condicion + ";";
            } else {
                sqlQueryStmt = "UPDATE " + tabla + " SET " + valoresCamposNuevos + " WHERE " + condicion + ";";

            }
            stmt = cone.createStatement();
            stmt.executeUpdate(sqlQueryStmt);
            stmt.close();
            cone.close();
        } catch (SQLException ex) {
            System.out.println("HA OCURRIDO EL SIGUIENTE ERROR: " + ex.getMessage());
        }
    }
}
