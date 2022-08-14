/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sandoval
 */
public class JDBCUtilities {
    // Atributos de clase para gestión de conexión con la base de datos
    private static final String UBICACION_BD = "C:\\Users\\Alexis Sandoval\\Desktop\\Ruta2_Minitic_2022\\Grupo_42\\Ciclo 2- Java\\Reto_5\\Reto_5\\ProyectosConstruccion(1).db";
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }  
}
