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
public class Compras_Dao {
    public List<Compras_Vo> listar() throws SQLException {
        ArrayList<Compras_Vo> respuesta= new ArrayList<>();
        Connection conn =JDBCUtilities.getConnection();
        Statement stmt =null;
        ResultSet rs = null;
        String consulta=" SELECT ID_Compra, Proveedor, p.Constructora ,p.Banco_Vinculado" 
                        +" FROM Compra c" 
                        +" INNER JOIN Proyecto p ON c.ID_Proyecto = p.ID_Proyecto"
                        +" WHERE p.Ciudad = 'Salento'"
                        +" AND c.Proveedor = 'Homecenter'";


    try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(consulta);
        while (rs.next()){
            Compras_Vo objeto = new Compras_Vo();
            objeto.setCompra(rs.getString("ID_Compra"));
            objeto.setProveedor(rs.getString("Proveedor"));
            objeto.setConstructora(rs.getString("Constructora"));
            objeto.setBanco_Vinculado(rs.getString("Banco_Vinculado"));
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
