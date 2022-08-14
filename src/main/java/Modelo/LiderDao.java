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
public class LiderDao {
    public List<LiderVo> listar() throws SQLException {
        ArrayList<LiderVo> respuesta= new ArrayList<>();
        Connection conn =JDBCUtilities.getConnection();
        Statement stmt =null;
        ResultSet rs = null;
        String consulta=" SELECT ID_Lider ,Nombre , Primer_Apellido , Ciudad_Residencia" 
                        +" FROM Lider l" 
                        +" ORDER BY Ciudad_Residencia ASC;";


    try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(consulta);
        while (rs.next()){
            LiderVo objeto = new LiderVo();
            objeto.setLider(rs.getString("ID_Lider"));
            objeto.setNombre(rs.getString("Nombre"));
            objeto.setPrimer_Apellido(rs.getString("Primer_Apellido"));
            objeto.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
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
