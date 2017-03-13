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
public class CoberturaPizza {

    private DoItYourself pizzaDoIt;
    private Prefab pizzaPrefab;

    /**
     *
     * @param pizza
     */
    public CoberturaPizza(DoItYourself pizza) {
        this.pizzaDoIt = pizza;
    }

    /**
     *
     * @param pizza
     */
    public CoberturaPizza(Prefab pizza) {
        this.pizzaPrefab = pizza;
    }

    /**
     *
     * @param pizza
     * @param cobertura
     */
    public void addCoberturaDoIt(DoItYourself pizza, Cobertura cobertura) {
        int precioTotal = pizzaDoIt.getPrecioTotal();
        int aux = cobertura.getPrecioCobertura();
        precioTotal = precioTotal + aux;
        pizzaDoIt.setPrecioTotal(precioTotal);
    }

    /**
     *
     * @param pizza
     * @param tamaño
     * @param basePizza
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
