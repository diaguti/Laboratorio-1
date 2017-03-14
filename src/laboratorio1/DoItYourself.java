/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 * Clase base para crear las pizzas de tipo DoItYourself
 * @author Diego Alejandro Gutierrez Rojas
 * @author Lina Paola Correa Ballen
 * @author Diego Alexander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
public class DoItYourself {

    private int tamaño;
    private int precioMin;
    private int precioTotal;
    private int opcBase;

    /**
     * Constructor de las pizzas DoItYourself
     * @param tamaño Entero para asignar el tamaño de la pizza.
     * @param opcBase Entero para asignar la base deseada de la pizza.
     */
    public DoItYourself(int tamaño, int opcBase) {
        this.opcBase = opcBase;
        this.tamaño = tamaño;
        this.precioMin = (tamaño * 500);
        this.precioTotal = (tamaño * 500);
    }

    /**
     *
     * @return el tamaño de la pizza
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     *
     * @param tamaño Entero para asignar el tamaño a la pizza DoItYourself
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     *
     * @return precio minimo de la pizza sin coberturas
     */
    public int getPrecioMin() {
        return precioMin;
    }

    /**
     *
     * @param precioMin Entero para asignar el precio minimo a la pizza DoItYourself
     */
    public void setPrecioMin(int precioMin) {
        this.precioMin = precioMin;
    }

    /**
     *
     * @return precio total de la pizza adicionandoles todas las coberturas deseadas
     */
    public int getPrecioTotal() {
        return precioTotal;
    }

    /**
     *
     * @param precioTotal Entero para asignar el precio total a la pizza DoItYourself
     */
    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }  

    /**
     *
     * @return opcion que indica la base deseada
     */
    public int getOpcBase() {
        return opcBase;
    }

    /**
     *
     * @param opcBase Entero para asignar la base deseada
     */
    public void setOpcBase(int opcBase) {
        this.opcBase = opcBase;
    }   
}
