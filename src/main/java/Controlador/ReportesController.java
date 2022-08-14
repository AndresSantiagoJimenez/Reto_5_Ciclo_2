/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Compras_Dao;
import Modelo.Compras_Vo;
import Modelo.LiderDao;
import Modelo.LiderVo;
import Modelo.Proyecto_Dao;
import Modelo.Proyecto_Vo;
/*import Modelo.ProyectoBancoDao;
import Modelo.ProyectoBancoVo;*/
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sandoval
 */
public class ReportesController {
    /*private ProyectoBancoDao proyectoBancoDao;
    


    public ReportesController(){
    proyectoBancoDao= new ProyectoBancoDao ();
    
    }

    public List<ProyectoBancoVo> listaTotalProyectoBanco(String banco) throws SQLException{
        return proyectoBancoDao.listar(banco);
    }*/
  
    /*private ProyectoBancoDao proyectoBancoDao;*/
    private LiderDao LiderDao;
    private Proyecto_Dao Proyecto_Dao;
    private Compras_Dao Compras_Dao;


    public ReportesController(){
    LiderDao= new LiderDao ();
    Proyecto_Dao = new Proyecto_Dao ();
    Compras_Dao = new Compras_Dao();
    
    }

    /*public List<ProyectoBancoVo> listaTotalProyectoBanco(String banco) throws SQLException{
        return proyectoBancoDao.listar(banco);
    }*/ 


    public List<LiderVo> listaTotalDeLider() throws SQLException{
        return LiderDao.listar();
    }
    
 
    public List<Proyecto_Vo> listaTotalDeProyectos() throws SQLException{
        return Proyecto_Dao.listar();
    }
    
    public List<Compras_Vo> listaTotalDeCompras() throws SQLException{
        return Compras_Dao.listar();
    }
}
