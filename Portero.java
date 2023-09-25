/**
 * La clase Portero representa a un portero en el campeonato de balonmano.
 * Hereda de la clase Jugador y añade atributos y métodos específicos para los porteros.
 *
 * @author Fernando Hernandez
 * @version 1.0
 * @since 22-09-2023
 */
public class Portero extends Jugador {

    // Número de paradas efectivas realizadas por el portero.
    private int paradasEfectivas;

    
    // Número de goles recibidos por el portero.
    private int golesRecibidos;

    /**
     * Constructor para crear un nuevo objeto Portero.
     *
     * @param nombre            Nombre del portero.
     * @param pais              País del portero.
     * @param faltas            Número de faltas cometidas por el portero.
     * @param golesDirectos     Número de goles directos anotados por el portero.
     * @param totalLanzamientos Número total de lanzamientos realizados por el portero.
     * @param paradasEfectivas  Número de paradas efectivas realizadas por el portero.
     * @param golesRecibidos    Número de goles recibidos por el portero.
     */
    public Portero(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int paradasEfectivas, int golesRecibidos) {
        super(nombre, pais, faltas, golesDirectos, totalLanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;
    }

    /**
     * Método para calcular la efectividad del portero.
     * Sobrescribe el método calcularEfectividad de la clase Jugador.
     *
     * @return La efectividad del portero.
     */
    @Override
    public double calcularEfectividad() {
        double efectividadParadas = ((double) paradasEfectivas - golesRecibidos) * 100 / (paradasEfectivas + golesRecibidos);
        double efectividadGoles = (double) getGolesDirectos() * 100 / getTotalLanzamientos();
        return efectividadParadas + efectividadGoles;
    }

    // Getters and Setters
    public int getParadasEfectivas() {
        return paradasEfectivas;
    }

    public void setParadasEfectivas(int paradasEfectivas) {
        this.paradasEfectivas = paradasEfectivas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    /**
     * Método que devuelve una representación en cadena del objeto Portero.
     *
     * @return Una cadena que representa al objeto Portero.
     */
    @Override
    public String toString() {
        return "Portero{" +
                "nombre='" + getNombre() + '\'' +
                ", pais='" + getPais() + '\'' +
                ", faltas=" + getFaltas() +
                ", golesDirectos=" + getGolesDirectos() +
                ", totalLanzamientos=" + getTotalLanzamientos() +
                ", paradasEfectivas=" + paradasEfectivas +
                ", golesRecibidos=" + golesRecibidos +
                '}';
    }
}
