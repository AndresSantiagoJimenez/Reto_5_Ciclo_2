/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alexis Sandoval
 */
public class Proyecto_Vo {
    private String proyecto;
    private String constructora;
    private Integer numero_habitaciones;
    private String ciudad;
    
    
    public String getProyecto() {
        return proyecto;
    }
    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }
    
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    
    public Integer getNumero_Habitaciones() {
        return numero_habitaciones;
    }
    public void setNumero_Habitaciones(Integer numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
   

    @Override
    public String toString(){
        return String.format("%-25s %,15.1f", proyecto,constructora,numero_habitaciones,ciudad);
    }
    
}
