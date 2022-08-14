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
public class LiderVo {
    private String lider;
    private String nombre;
    private String primer_apellido;
    private String ciudad_Residencia;
    
    
    public String getLider() {
        return lider;
    }
    public void setLider(String lider) {
        this.lider = lider;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPrimer_Apellido() {
        return primer_apellido;
    }
    public void setPrimer_Apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }
    
    public String getCiudad_Residencia() {
        return ciudad_Residencia;
    }
    public void setCiudad_Residencia(String ciudad_Residencia) {
        this.ciudad_Residencia = ciudad_Residencia;
    }
    
   

    @Override
    public String toString(){
        return String.format("%-25s %,15.1f", lider,nombre,primer_apellido,ciudad_Residencia);
    }
}
