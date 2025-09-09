Class Main {
    public static void main(String[] args) {
        System.out.println("Vamosacrear un programapara adiviar un número");
}
    
private int numeroAdivinar =7; 
private boolean adivinado = false;
private int numeroIntroducido;
Scanner scanner = new Scanner(System.in);

System,out.println(x:"Introduce un número entre 1 y 10: ");
while (adivinado == false){
    try{
        numeroIntroducido =scanner.nextInt();
    if (numeroIntroducido == numeroAdivinar){
        System.out.println(x:"Adivinaste el numero }");
        adivinado = true;
    } else {
        System.out.println(x:"No Adivinaste. Intenta de nuevo: ");
    }
    catch (Exeption e) {
        System.out.println(x:"Por favor,Ingrese un número válido ");
        scanner.next(); 
    }
        
    }
    
    
}