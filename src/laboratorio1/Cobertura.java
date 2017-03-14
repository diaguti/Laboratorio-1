package laboratorio1;

/**
 * Clase base para crear las coberturas de la pizza.
 * @author Diego Alejandro Gutierrez Rojas
 * @author Lina Paola Correa Ballen
 * @author Diego Alexander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
public class Cobertura {

    private String nombreCobertura;
    private int precioCobertura;

    /**
     * Constructor de las coberturas
     * @param nombreCobertura String para asignar el nombre de la cobertura.
     * @param precioCobertura Entero para asignar el precio de la cobertura.
     */
    public Cobertura(String nombreCobertura, int precioCobertura) {

        this.nombreCobertura = nombreCobertura;
        this.precioCobertura = precioCobertura;
    }

    /**
     *
     * @return nombre de la cobertura
     */
    public String getNombreCobertura() {
        return nombreCobertura;
    }

    /**
     *
     * @param nombreCobertura String para asignar el nombre de la cobertura
     */
    public void setNombreCobertura(String nombreCobertura) {
        this.nombreCobertura = nombreCobertura;
    }

    /**
     *
     * @return precio de la cobertura
     */
    public int getPrecioCobertura() {
        return precioCobertura;
    }

    /**
     *
     * @param precioCobertura Entero para asignar el precio de la cobertura
     */
    public void setPrecioCobertura(int precioCobertura) {
        this.precioCobertura = precioCobertura;
    }
}
