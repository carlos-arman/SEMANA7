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
}
