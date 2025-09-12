public class Tablero {

    private String[][] tablero;
    
    public Tablero() {
        tablero = new String[6][7]; 
    }
    public void colocarPieza(int columna, String pieza) {
        for (int fila = 5; fila >= 0; fila--) { 
            if (tablero[fila][columna] == null) {
                tablero[fila][columna] = pieza;
                break;
            }
        }
    }

    public String obtenerPieza(int fila, int columna) {
        return tablero[fila][columna];
    }

    public void mostrarTablero() {
        System.out.println(" 1 2 3 4 5 6 7"); 
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print((tablero[i][j] != null ? tablero[i][j] : "-") + " ");
               }
                System.out.println();
            }
        }

    private boolean columnaLlena(int columna) {
        return tablero[0][columna] != null;
    }
    public boolean verificarEmpate() {
        for (int j = 0; j < 7; j++) {
            if (!columnaLlena(j)) {
                return false;
            }
        }
        return true;
    }
    public boolean verificarVictoria() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= 3; j++) {
                if (tablero[i][j] != null &&
                    tablero[i][j].equals(tablero[i][j+1]) &&
                    tablero[i][j].equals(tablero[i][j+2]) &&
                    tablero[i][j].equals(tablero[i][j+3])) {
                    return true;
                }
            }
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < 7; j++) {
                if (tablero[i][j] != null &&
                    tablero[i][j].equals(tablero[i+1][j]) &&
                    tablero[i][j].equals(tablero[i+2][j]) &&
                    tablero[i][j].equals(tablero[i+3][j])) {
                    return true;
                }
            }
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                if (tablero[i][j] != null &&
                    tablero[i][j].equals(tablero[i+1][j+1]) &&
                    tablero[i][j].equals(tablero[i+2][j+2]) &&
                    tablero[i][j].equals(tablero[i+3][j+3])) {
                    return true;
                }
            }
        }
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j <= 3; j++) {
                if (tablero[i][j] != null &&
                    tablero[i][j].equals(tablero[i-1][j+1]) &&
                    tablero[i][j].equals(tablero[i-2][j+2]) &&
                    tablero[i][j].equals(tablero[i-3][j+3])) {
                    return true;
                }
            }
        }
        
        return false;
    }
}