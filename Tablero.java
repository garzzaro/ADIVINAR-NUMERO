public class Tablero {
    
    private String[][] tablero;

    public Tablero() {
        tablero = new String[3][3];
    }

    public void colocarPieza(int fila, int columna, String pieza) {
        tablero[fila][columna] = pieza;
    }

    public String obtenerPieza(int fila, int columna) {
        return tablero[fila][columna];
    }

    public void mostrarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((tablero[i][j] != null ? tablero[i][j] : "-") + " ");
            }
            System.out.println();
        }
    }
}