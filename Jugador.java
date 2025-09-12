public class Jugador {
    private String nombre;
    private int puntaje;

    public Jugador(String nombre, String string) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void incrementarPuntaje(int puntos) {
        this.puntaje += puntos;
    }

    public String getPieza() {
        return nombre.equals("Jugador 1") ? "X" : "O";
    }
}