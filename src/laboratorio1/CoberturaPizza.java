/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 * Clase que conecta los diferentes tipos de pizza y modifica el precio segun lo agregado.
 * @author Diego Alejandro Gutierrez Rojas
 * @author Lina Paola Correa Ballen
 * @author Diego Alexander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
public class CoberturaPizza {

    private DoItYourself pizzaDoIt;
    private Prefab pizzaPrefab;

    /**
     * Constructor con el tipo de pizza DoItYourself
     * @param pizza del tipo de pizza DoItYourself 
     */
    public CoberturaPizza(DoItYourself pizza) {
        this.pizzaDoIt = pizza;
    }

    /**
     * Constructor con el tipo de pizza Prefab
     * @param pizza del tipo de pizza Prefab
     */
    public CoberturaPizza(Prefab pizza) {
        this.pizzaPrefab = pizza;
    }

    /**
     * Metodo para modificar el precio total de la pizza de tipo DoItYourself
     * @param pizza De tipo pizza DoItYourself para obtener el precio hasta ese momento de dicha pizza y poderlo modificar
     * @param cobertura De tipo Cobertura para obtener el precio de la cobertura y poderlo adicionar al precio total de la pizza.
     */
    public void addCoberturaDoIt(DoItYourself pizza, Cobertura cobertura) {
        int precioTotal = pizzaDoIt.getPrecioTotal();
        int aux = cobertura.getPrecioCobertura();
        precioTotal = precioTotal + aux;
        pizzaDoIt.setPrecioTotal(precioTotal);
    }

    /**
     * Metodo para modificar el precio total de la pizza de tipo Prefab
     * @param pizza De tipo pizza Prefab para obtener el precio de la pizza Prefab
     * @param tamaño Entero con el tamaño deseado de la pizza y asi poderle sumar ese valor al precio total de la pizza
     * @param basePizza Int con la opcion deseada para la base de la pizza.
     */
    public void addCoberturaPrefab(Prefab pizza, int tamaño, int basePizza) {
        pizzaPrefab.setOpcBase(basePizza);
        pizzaPrefab.setTamaño(tamaño);
        int precTam = (tamaño * 500);
        int precioTotal = pizzaPrefab.getPrecioTotal();
        int aux = pizzaPrefab.getPrecio();
        precioTotal = (precioTotal + aux + precTam);
        pizzaPrefab.setPrecioTotal(precioTotal);
    }

}
