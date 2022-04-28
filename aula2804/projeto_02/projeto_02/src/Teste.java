public class Teste {
    public static void main(String[] args) {
        Escoteiro escoteiro1 = new Escoteiro();
        Escoteiro escoteiro2 = new Escoteiro();
        Escoteiro escoteiro3 = new Escoteiro();

        escoteiro1.nome = "Pedrinho";
        escoteiro1.idade = 13;
        escoteiro1.turma = "Escoteiro";

        escoteiro2.nome = "Juninho";
        escoteiro2.idade = 10;
        escoteiro2.turma = "Lobinho";

        escoteiro3.nome = "Oscar";
        escoteiro3.idade = 33;
        escoteiro3.turma = "Senior";

        escoteiro1.imprimir();
        escoteiro2.imprimir();
        escoteiro3.imprimir();
    }
}