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
public class Compras_Vo {
    private String compra;
    private String proveedor;
    private String constructora;
    private String banco_vinculado;
    
    
    
    public String getCompra() {
        return compra;
    }
    public void setCompra(String compra) {
        this.compra = compra;
    }
    
    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    
    
    public String getBanco_Vinculado() {
        return banco_vinculado;
    }
    public void setBanco_Vinculado(String banco_vinculado) {
        this.banco_vinculado = banco_vinculado;
    }
    
   

    @Override
    public String toString(){
        return String.format("%-25s %,15.1f", compra,proveedor,constructora,banco_vinculado);
    }
}
