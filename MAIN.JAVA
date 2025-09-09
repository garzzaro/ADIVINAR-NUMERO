import java.util.Scanner;

class MAIN {
    public static void main(String[] args) {
        System.out.println("Vamos a crear un prgramam para adivinar un numero");
    
    int numeroAdivinar = 5;
    int numeroUsuario = 0;
    boolean adivinado = false;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Adivina el numero entre 1 y 10");
        while(adivinado == false) {
    try {
        numeroUsuario = scanner.nextInt();
         if (numeroUsuario < 1 || numeroUsuario > 10) {
                throw new IllegalArgumentException();
            }
        if(numeroUsuario == numeroAdivinar) {
            System.out.println("Ganaste, adivinaste el numero");
            adivinado = true;
        } else {
            System.out.println("Incorrecto vuelve a intentarlo");
        }
    }catch(IllegalArgumentException e) {
        System.out.println("El numero debe estar entre 1 y 10");
    } 
    catch(Exception e) {
        System.out.println("Por favor ingresa un numero valido");
        scanner.nextLine();
    }
    }
    }
}