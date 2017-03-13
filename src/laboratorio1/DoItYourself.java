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
public class DoItYourself {

    private int tamaño;
    private int opcion;
    private int precioMin;
    private int precioTotal;
    private int opcBase;

    /**
     * @param tamaño
     * @param opcBase
     */
    public DoItYourself(int tamaño, int opcBase) {
        this.opcBase = opcBase;
        this.tamaño = tamaño;
        this.precioMin = (tamaño * 500);
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
    public int getOpcion() {
        return opcion;
    }

    /**
     *
     * @param opcion
     */
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    /**
     *
     * @return
     */
    public int getPrecioMin() {
        return precioMin;
    }

    /**
     *
     * @param precioMin
     */
    public void setPrecioMin(int precioMin) {
        this.precioMin = precioMin;
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
    
    
}
