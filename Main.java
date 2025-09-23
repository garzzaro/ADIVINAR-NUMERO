import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Tablero tablero;
    private static Jugador jugador1;
    private static Jugador jugador2;
    private static Jugador jugadorActual;
    
    public static void main(String[] args) {
        iniciarJuego();
    }
    
    private static void iniciarJuego() {
        System.out.println("CONNECT 4");
        
        // Crear jugadores
        System.out.print("Nombre Jugador 1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Nombre Jugador 2: ");
        String nombre2 = scanner.nextLine();
        
        jugador1 = new Jugador(nombre1, "X");
        jugador2 = new Jugador(nombre2, "O");
        jugadorActual = jugador1;
        
        boolean seguirJugando = true;
        
        while (seguirJugando) {
            tablero = new Tablero();
            jugarPartida();
            
            System.out.print("¿Jugar otra partida? (s/n): ");
            String respuesta = scanner.nextLine();
            seguirJugando = respuesta.equalsIgnoreCase("s");
        }
        
        // Mostrar resumen final
        System.out.println("\nRESUMEN FINAL");
        System.out.println(jugador1.getNombre() + ": " + jugador1.getPuntaje() + " victorias");
        System.out.println(jugador2.getNombre() + ": " + jugador2.getPuntaje() + " victorias");
        
        if (jugador1.getPuntaje() > jugador2.getPuntaje()) {
            System.out.println("Ganador: " + jugador1.getNombre());
        } else if (jugador2.getPuntaje() > jugador1.getPuntaje()) {
            System.out.println("Ganador: " + jugador2.getNombre());
        } else {
            System.out.println("Empate");
        }
        
        scanner.close();
    }
    
    private static void jugarPartida() {
        boolean partidaTerminada = false;
        jugadorActual = jugador1; 
        
        while (!partidaTerminada) {
            tablero.mostrarTablero();
            System.out.print(jugadorActual.getNombre() + " (" + jugadorActual.getPieza() + "), elija columna (1-7): ");
            
            try {
                int columna = scanner.nextInt() - 1;
                scanner.nextLine(); 
                
                if (columna >= 0 && columna < 7 && tablero.obtenerPieza(0, columna) == null) {
                    tablero.colocarPieza(columna, jugadorActual.getPieza());
                    
                    if (tablero.verificarVictoria()) {
                        tablero.mostrarTablero();
                        System.out.println("¡" + jugadorActual.getNombre() + " gana");
                        jugadorActual.incrementarPuntaje(1);
                        partidaTerminada = true;
                    } else if (tablero.verificarEmpate()) {
                        tablero.mostrarTablero();
                        System.out.println("Empate");
                        partidaTerminada = true;
                    } else {
                       
                        jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
                    }
                } else {
                    System.out.println(" Intente de nuevo.");
                }
                
            } catch (Exception e) {
                System.out.println("Error");
                scanner.nextLine();
        }
    }
}

}
