import java.util.Scanner;

/**
 * La clase Main sirve como punto de entrada para el programa del campeonato de balonmano.
 * Contiene métodos para interactuar con el usuario y cumplir con todas las funcionalidades requeridas.
 *
 * @author Fernando Hernandez
 * @version 1.0
 * @since 22-09-2023
 */
public class Main {

    /**
     * Método principal para ejecutar el programa.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Campeonato campeonato = new Campeonato();

        while (true) {
            System.out.println("1. Registrar Jugador");
            System.out.println("2. Mostrar Jugadores");
            System.out.println("3. Mostrar Mejores Porteros");
            System.out.println("4. Contar Extremos Efectivos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (opcion) {
                case 1:
                    System.out.print("Tipo de Jugador (Portero/Extremo): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("País: ");
                    String pais = scanner.nextLine();
                    System.out.print("Faltas: ");
                    int faltas = scanner.nextInt();

                    if ("Portero".equalsIgnoreCase(tipo)) {
                        System.out.print("Paradas Efectivas: ");
                        int paradasEfectivas = scanner.nextInt();
                        System.out.print("Goles Recibidos: ");
                        int golesRecibidos = scanner.nextInt();
                        campeonato.registrarJugador(new Portero(nombre, pais, faltas, 0, 0, paradasEfectivas, golesRecibidos));
                    } else if ("Extremo".equalsIgnoreCase(tipo)) {
                        System.out.print("Goles Directos: ");
                        int golesDirectos = scanner.nextInt();
                        System.out.print("Total de Lanzamientos: ");
                        int totalLanzamientos = scanner.nextInt();
                        System.out.print("Pases: ");
                        int pases = scanner.nextInt();
                        System.out.print("Asistencias Efectivas: ");
                        int asistenciasEfectivas = scanner.nextInt();
                        campeonato.registrarJugador(new Extremo(nombre, pais, faltas, golesDirectos, totalLanzamientos, pases, asistenciasEfectivas));
                    } else {
                        System.out.println("Tipo de Jugador no válido.");
                    }
                    break;
                case 2:
                    campeonato.mostrarJugadores();
                    break;
                case 3:
                    campeonato.mejoresPorteros().forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Número de Extremos con más de un 85% de efectividad: " + campeonato.extremosEfectivos());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
