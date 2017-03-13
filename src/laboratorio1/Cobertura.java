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
public class Cobertura {

    private String nombreCobertura;
    private int precioCobertura;

    /**
     *
     * @param nombreCobertura
     * @param precioCobertura
     */
    public Cobertura(String nombreCobertura, int precioCobertura) {

        this.nombreCobertura = nombreCobertura;
        this.precioCobertura = precioCobertura;
    }

    /**
     *
     * @return
     */
    public String getNombreCobertura() {
        return nombreCobertura;
    }

    /**
     *
     * @param nombreCobertura
     */
    public void setNombreCobertura(String nombreCobertura) {
        this.nombreCobertura = nombreCobertura;
    }

    /**
     *
     * @return
     */
    public int getPrecioCobertura() {
        return precioCobertura;
    }

    /**
     *
     * @param precioCobertura
     */
    public void setPrecioCobertura(int precioCobertura) {
        this.precioCobertura = precioCobertura;
    }
}
