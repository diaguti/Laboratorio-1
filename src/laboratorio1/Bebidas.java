package laboratorio1;

/**
 * Clase base para crear los objetos bebidas.
 * @author Diego Alejandro Gutierrez Rojas
 * @author Lina Paola Correa Ballen
 * @author Diego Alexander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
public class Bebidas {

    private String sabor;
    private int precio;
    private int tamaño;
    private int precioTotal;

    /**
     * Constructor de la bebida
     * @param sabor String con el sabor de la bebida
     * @param precio Entero con el precio de la bebida
     */
    public Bebidas(String sabor, int precio) {
        this.sabor = sabor;
        this.precio = precio;
        precioTotal = (tamaño * 2000);
    }

    /**
     *
     * @return sabor de la bebida
     */
    public String getSabor() {
        return sabor;
    }

    /**
     *
     * @param sabor String para asignar el sabor a la bebida
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     *
     * @return precio de la bebida
     */
    public int getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio Entero para asignar el precio a la bebida
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     *
     * @return tamaño de la bebida
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     *
     * @param tamaño Entero para asignar el tamaño a la bebida
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     *
     * @return precio total de la bebida con sabor y tamaño
     */
    public int getPrecioTotal() {
        return precioTotal;
    }

    /**
     *
     * @param precioTotal Entero para asignar el precio total de la bebida con sabor y tamaño
     */
    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
}
