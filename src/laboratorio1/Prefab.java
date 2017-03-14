/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 * Clase base para las pizzas de tipo Prefab
 * @author Diego Alejandro Gutierrez Rojas
 * @author Lina Paola Correa Ballen
 * @author Diego Alexander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
public class Prefab {

    private String nombre;
    private int tamaño;
    private int opcBase;
    private int precio;
    private int precioTotal;

    /**
     * Constructor de las pizzas Prefab
     * @param precio Entero para asignar el precio a la pizza Prefab
     * @param nombre String para asignar el nombre a la pizza Prefab
     */
    public Prefab(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
        this.precioTotal = (tamaño * 500);        
    }

    /**
     *
     * @return tamaño de la pizza Prefab
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     *
     * @param tamaño Entero para asignar el tamaño de la pizza Prefab
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     *
     * @return base deseada de la pizza Prefab
     */
    public int getOpcBase() {
        return opcBase;
    }

    /**
     *
     * @param opcBase Entero para asignar la base deseada a la pizza Prefab
     */
    public void setOpcBase(int opcBase) {
        this.opcBase = opcBase;
    }    

    /**
     *
     * @return precio de la pizza Prefab sin tamaño
     */
    public int getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio Entero para asignar el precio a la pizza Prefab sin tamaño
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     *
     * @return nombre de la pizza 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre String para asignar el nombre a la pizza prefab
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return precio total de la pizza adicionandole el precio con el tamaño
     */
    public int getPrecioTotal() {
        return precioTotal;
    }

    /**
     *
     * @param precioTotal Entero para asignar el valor total a la pizza Prefab con el tamaño incluido
     */
    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
}
