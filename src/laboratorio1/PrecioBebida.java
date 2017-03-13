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
public class PrecioBebida {

    private Bebidas bebidas;

    /**
     *
     * @param bebida
     */
    public PrecioBebida(Bebidas bebida) {
        this.bebidas = bebida;
    }

    /**
     *
     * @param bebida
     * @param tamaño
     */
    public void PreciosBebida(Bebidas bebida, int tamaño) {
        int precioTamaño = (tamaño * 2000);
        int precioTotal = bebidas.getPrecio();
        precioTotal = precioTotal + precioTamaño;
        bebidas.setPrecioTotal(precioTotal);
    }
}