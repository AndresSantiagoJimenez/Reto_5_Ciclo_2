/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexis Sandoval
 */
public class Proyecto_Dao {
    public List<Proyecto_Vo> listar() throws SQLException {
        ArrayList<Proyecto_Vo> respuesta= new ArrayList<>();
        Connection conn =JDBCUtilities.getConnection();
        Statement stmt =null;
        ResultSet rs = null;
        String consulta=" SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad" 
                        +" FROM Proyecto p" 
                        +" WHERE  Ciudad IN ('Santa Marta','Cartagena' ,'Barranquilla')"
                        +" AND Clasificacion  = 'Casa Campestre'";


    try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(consulta);
        while (rs.next()){
            Proyecto_Vo objeto = new Proyecto_Vo();
            objeto.setProyecto(rs.getString("ID_Proyecto"));
            objeto.setConstructora(rs.getString("Constructora"));
            objeto.setNumero_Habitaciones(rs.getInt("Numero_Habitaciones"));
            objeto.setCiudad(rs.getString("Ciudad"));
            respuesta.add(objeto);
            
        }

    }finally{
        if (rs != null){
            rs.close();
            }
            if (stmt != null) {
            stmt.close();
            }
            if (conn != null){
            conn.close();
            }
    }
    return respuesta;

    }
    
}
