/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 * @author Diego Alejandro Gutierrez
 * @author Lina
 * @author Dieg
 * @author julian
 */
public class Prefab {

    private String nombre;
    private int tamaño;
    private int opcBase;
    private int precio;
    private int precioTotal;

    /**
     *
     * @param precio
     * @param nombre
     */
    public Prefab(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
        this.precioTotal = (tamaño * 500);        
    }

    /**
     *
     * @return
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     *
     * @param tamaño
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     *
     * @return
     */
    public int getOpcBase() {
        return opcBase;
    }

    /**
     *
     * @param opcBase
     */
    public void setOpcBase(int opcBase) {
        this.opcBase = opcBase;
    }    

    /**
     *
     * @return
     */
    public int getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getPrecioTotal() {
        return precioTotal;
    }

    /**
     *
     * @param precioTotal
     */
    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
}
