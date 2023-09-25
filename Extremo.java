/**
 * La clase Extremo representa a un extremo en el campeonato de balonmano.
 * Hereda de la clase Jugador y añade atributos y métodos específicos para los extremos.
 *
 * @author Fernando Hernandez
 * @version 1.0
 * @since 22-09-2023
 */
public class Extremo extends Jugador {

    
    // Número de pases realizados por el extremo.
    private int pases;

    
    // Número de asistencias efectivas realizadas por el extremo.
    private int asistenciasEfectivas;

    /**
     * Constructor para crear un nuevo objeto Extremo.
     *
     * @param nombre              Nombre del extremo.
     * @param pais                País del extremo.
     * @param faltas              Número de faltas cometidas por el extremo.
     * @param golesDirectos       Número de goles directos anotados por el extremo.
     * @param totalLanzamientos   Número total de lanzamientos realizados por el extremo.
     * @param pases               Número de pases realizados por el extremo.
     * @param asistenciasEfectivas Número de asistencias efectivas realizadas por el extremo.
     */
    public Extremo(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int pases, int asistenciasEfectivas) {
        super(nombre, pais, faltas, golesDirectos, totalLanzamientos);
        this.pases = pases;
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    /**
     * Método para calcular la efectividad del extremo.
     * Sobrescribe el método calcularEfectividad de la clase Jugador.
     *
     * @return La efectividad del extremo.
     */
    @Override
    public double calcularEfectividad() {
        double efectividadPases = ((double) pases + asistenciasEfectivas - getFaltas()) * 100 / (pases + asistenciasEfectivas + getFaltas());
        double efectividadGoles = (double) getGolesDirectos() * 100 / getTotalLanzamientos();
        return efectividadPases + efectividadGoles;
    }

    // Getters and Setters
    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getAsistenciasEfectivas() {
        return asistenciasEfectivas;
    }

    public void setAsistenciasEfectivas(int asistenciasEfectivas) {
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    /**
     * Método que devuelve una representación en cadena del objeto Extremo.
     *
     * @return Una cadena que representa al objeto Extremo.
     */
    @Override
    public String toString() {
        return "Extremo{" +
                "nombre='" + getNombre() + '\'' +
                ", pais='" + getPais() + '\'' +
                ", faltas=" + getFaltas() +
                ", golesDirectos=" + getGolesDirectos() +
                ", totalLanzamientos=" + getTotalLanzamientos() +
                ", pases=" + pases +
                ", asistenciasEfectivas=" + asistenciasEfectivas +
                '}';
    }
}
