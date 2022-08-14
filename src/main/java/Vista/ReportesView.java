/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ReportesController;
import Modelo.Compras_Vo;
import Modelo.LiderVo;
import Modelo.Proyecto_Vo;
/*import Modelo.ProyectoBancoVo;*/
import java.util.List;

/**
 *
 * @author Alexis Sandoval
 */
public class ReportesView {
    private static ReportesController controller;

    public ReportesView(){
        controller = new ReportesController();
    }

    private String repitaCaracter(Character caracter, Integer veces) {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
        respuesta += caracter;
        }
        return respuesta;
        }
    /*public void proyectosFinanciadosPorBanco(String banco) {
        System.out.println(repitaCaracter('=', 36) + " LISTADO DE PROYECTOS POR BANCO "
        + repitaCaracter('=', 37));
        if (banco != null && !banco.isBlank()) {
        System.out.println(String.format("%3s %-25s %-20s %-15s %-7s %-30s",
        "ID", "CONSTRUCTORA", "CIUDAD", "CLASIFICACION", "ESTRATO", "LIDER"));
        System.out.println(repitaCaracter('-', 105));
        
        try {
            List<ProyectoBancoVo> proyectos= controller.listaTotalProyectoBanco(banco);
            for (ProyectoBancoVo proyecto:proyectos){
            System.out.println(proyecto);
        }
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
        }
        }*/
    
    public void lideres() {
        System.out.println(repitaCaracter('=', 6) + " Lideres Primer Informe "
        + repitaCaracter('=', 7));
        System.out.println(String.format("%-25s %15s", "ID_LIDER", "Nombre", "Primer_Apellido", "Ciudad_Residencia"));
        System.out.println(repitaCaracter('-', 41));
        try {
            List<LiderVo> lider1= controller.listaTotalDeLider();
            for (LiderVo lideres:lider1){
            System.out.println(lideres);
        }
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
    }
    
    
    public void proyectos() {
        System.out.println(repitaCaracter('=', 6) + " Proyectos Segundo Informe "
        + repitaCaracter('=', 7));
        System.out.println(String.format("%-25s %15s", "ID_PROYECTO", "Constructora", "Numero_Habitaciones", "Ciudad"));
        System.out.println(repitaCaracter('-', 41));
        try {
            List<Proyecto_Vo> proyecto_1= controller.listaTotalDeProyectos();
            for (Proyecto_Vo proyectos:proyecto_1){
            System.out.println(proyectos);
        }
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
    }
    
    
    public void compras() {
        System.out.println(repitaCaracter('=', 6) + " Proyectos Tercer Informe "
        + repitaCaracter('=', 7));
        System.out.println(String.format("%-25s %15s", "ID_COMPRAS", "Proveedor", "Constructora", "Banco_Vinculado"));
        System.out.println(repitaCaracter('-', 41));
        try {
            List<Compras_Vo> compra_1= controller.listaTotalDeCompras();
            for (Compras_Vo compras:compra_1){
            System.out.println(compras);
        }
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
    }
}
    
    
    

