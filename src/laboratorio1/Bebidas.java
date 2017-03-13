package laboratorio1;

/**
 * @author Diego Alejandro Gutierrez
 * @author Lina
 * @author Dieg
 * @author julian
 */
public class Bebidas {

    private String sabor;
    private int precio;
    private int tamaño;
    private int precioTotal;

    /**
     *
     * @param sabor
     * @param precio
     */
    public Bebidas(String sabor, int precio) {
        this.sabor = sabor;
        this.precio = precio;
        precioTotal = (tamaño * 2000);
    }

    /**
     *
     * @return
     */
    public String getSabor() {
        return sabor;
    }

    /**
     *
     * @param sabor
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
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
