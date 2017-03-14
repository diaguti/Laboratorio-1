/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 * Clase que modifica el precio de la bebida tomando en cuenta el precio y el sabor de la bebida
 * @author Diego Alejandro Gutierrez Rojas
 * @author Lina Paola Correa Ballen
 * @author Diego Alexander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
public class PrecioBebida {

    private Bebidas bebidas;

    /**
     * Constructor del precioBebida
     * @param bebida
     */
    public PrecioBebida(Bebidas bebida) {
        this.bebidas = bebida;
    }

    /**
     * Metodo para calcular el precio de la bebida tomando en cuenta el sabor seleccionado y el tamaño seleccionado
     * @param bebida de tipo Bebida para asignar el precio de la bebida basados en su sabor.
     * @param tamaño para obtener el precio de la bebida segun su tamaño y adicionarlo al precio segun el sabor.
     */
    public void PreciosBebida(Bebidas bebida, int tamaño) {
        int precioTamaño = (tamaño * 2000);
        int precioTotal = bebidas.getPrecio();
        precioTotal = precioTotal + precioTamaño;
        bebidas.setPrecioTotal(precioTotal);
    }
}