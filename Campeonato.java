import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * La clase Campeonato representa al campeonato de balonmano.
 * Contiene una lista de jugadores y métodos para registrar y mostrar información de los jugadores.
 *
 * @author Fernando Hernandez
 * @version 1.0
 * @since 22-09-2023
 */
public class Campeonato {

    
    // Lista de jugadores registrados en el campeonato.
    private final List<Jugador> jugadores;

    
    // Constructor para crear un nuevo objeto Campeonato.
    public Campeonato() {
        this.jugadores = new ArrayList<>();
    }

    /**
     * Método para registrar un nuevo jugador en el campeonato.
     *
     * @param jugador El jugador a registrar.
     */
    public void registrarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    /**
     * Método para mostrar todos los jugadores registrados en el campeonato.
     */
    public void mostrarJugadores() {
        jugadores.forEach(System.out::println);
    }

    /**
     * Método para obtener los 3 mejores porteros en función de su efectividad.
     *
     * @return Una lista con los 3 mejores porteros.
     */
    public List<Portero> mejoresPorteros() {
        return jugadores.stream()
                .filter(Portero.class::isInstance)
                .map(Portero.class::cast)
                .sorted((p1, p2) -> Double.compare(p2.calcularEfectividad(), p1.calcularEfectividad()))
                .limit(3)
                .collect(Collectors.toList());
    }

    /**
     * Método para obtener la cantidad de extremos con más de un 85% de efectividad.
     *
     * @return El número de extremos con más de un 85% de efectividad.
     */
    public long extremosEfectivos() {
        return jugadores.stream()
                .filter(Extremo.class::isInstance)
                .map(Extremo.class::cast)
                .filter(e -> e.calcularEfectividad() > 85)
                .count();
    }
}
