import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        aluno1.setRm(123);
        aluno1.setNome("Augusto Cesar Orelha");
        aluno1.setEmail("emaildoaugusto@gmail.com");
        aluno1.setTurma("2AMSDS");
        aluno1.setIdade(16);
        aluno1.matricular();
        aluno1.fazAniversario();
        aluno1.listarDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Rm do aluno 2");
        aluno2.setRm(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome do aluno 2");
        aluno2.setNome(sc.nextLine());
        System.out.println("Digite o email do aluno 2");
        aluno2.setEmail(sc.nextLine());
        System.out.println("Digie a turma do aluno 2");
        aluno2.setTurma(sc.nextLine());
        System.out.println("Digite a idade do aluno 2");
        aluno2.setIdade(Integer.parseInt(sc.nextLine()));
        aluno2.matricular();
        aluno2.fazAniversario();
        aluno2.listarDados();
    }
}