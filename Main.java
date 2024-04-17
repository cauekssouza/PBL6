public class Main {
    public static void main(String[] args) {
        // Usar o polimorfismo para interações
        interação interação = new CurtirPublicação();
    interação.interagir(); // Saída: Curtindo publicação...

        interação = new Seguir();
        interação.interagir(); // Saída: Seguindo usuário...
    }
}
