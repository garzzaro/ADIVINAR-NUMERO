public class Main {
    public static void main(String[] args) {

        Connect4Controller juego = new Connect4Controller (null, null);

        juego.jugar(0, 0);
        juego.jugar(1, 0);
        juego.jugar(0, 1);
        juego.jugar(1, 2);
        juego.jugar(0, 2);
    }
}