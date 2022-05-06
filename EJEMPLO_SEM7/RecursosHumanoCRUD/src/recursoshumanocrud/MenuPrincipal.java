/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursoshumanocrud;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Armando
 */
public class MenuPrincipal {
    public static void main(String[] args) throws SQLException {
        desplegarMenu();
    }
    public static void desplegarMenu() throws SQLException {
        Scanner leer = new Scanner(System.in);

        String opcionMenu;
        //Menu a desplegar
        System.out.println("**************************************");
        System.out.println("|      CRUD DE JAVA EN CONSOLA       |");
        System.out.println("|  Opciones                          |");
        System.out.println("|        1. Crear registro           |");
        System.out.println("|        2. Consultar Registro       |");
        System.out.println("|        3. Actualizar registro      |");
        System.out.println("|        4. Eliminar Registro        |");
        System.out.println("|        5. Salir                    |");
        System.out.println("**************************************");
        System.out.println("Seleccionar Opcion");

        opcionMenu = leer.next();

        switch(opcionMenu){
            case "1" :
            //Create create = new Create();
            break;
            case "2":
                //Read read = new Read();
            break;
            case "3" :
                //Update update = new Update();
            break;
            case "4" :
                //Delete delete = new Delete();
            break;
            case "5":
                
            System.exit(0);
            break;
            default:
            System.out.println("Seleccion invalida!");
            break;
        }

    }
}