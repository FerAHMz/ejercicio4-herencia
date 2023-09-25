/**
 * La clase Jugador representa a un jugador genérico en el campeonato de balonmano.
 * Contiene atributos y métodos comunes a todos los jugadores.
 *
 * @author Fernando Hernandez
 * @version 1.0
 * @since 22-09-2023
 */
public class Jugador {

    
    // Nombre del jugador.
    private String nombre;

    
    //País del jugador.
    private String pais;

    
    //Número de faltas cometidas por el jugador.
    private int faltas;


    // Número de goles directos anotados por el jugador.
    private int golesDirectos;

    
    // Número total de lanzamientos realizados por el jugador.
    private int totalLanzamientos;

    /**
     * Constructor para crear un nuevo objeto Jugador.
     *
     * @param nombre            Nombre del jugador.
     * @param pais              País del jugador.
     * @param faltas            Número de faltas cometidas por el jugador.
     * @param golesDirectos     Número de goles directos anotados por el jugador.
     * @param totalLanzamientos Número total de lanzamientos realizados por el jugador.
     */
    public Jugador(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
    }

    /**
     * Método para calcular la efectividad del jugador.
     * Este método deberá ser sobreescrito por las subclases.
     *
     * @return La efectividad del jugador.
     */
    public double calcularEfectividad() {
        // Este método será sobreescrito por las subclases Portero y Extremo.
        return 0.0;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getGolesDirectos() {
        return golesDirectos;
    }

    public void setGolesDirectos(int golesDirectos) {
        this.golesDirectos = golesDirectos;
    }

    public int getTotalLanzamientos() {
        return totalLanzamientos;
    }

    public void setTotalLanzamientos(int totalLanzamientos) {
        this.totalLanzamientos = totalLanzamientos;
    }

    /**
     * Método que devuelve una representación en cadena del objeto Jugador.
     *
     * @return Una cadena que representa al objeto Jugador.
     */
    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", faltas=" + faltas +
                ", golesDirectos=" + golesDirectos +
                ", totalLanzamientos=" + totalLanzamientos +
                '}';
    }
}

