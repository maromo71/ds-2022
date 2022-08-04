public class Main {
    public static void main(String[] args) {
        codigo(45, "Banana com Queijo");
    }

    public static void codigo(int valor, String texto){
        for (int i = 0; i <valor; i++) {
            System.out.println(texto);
        }
    }
}