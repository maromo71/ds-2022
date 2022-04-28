public class Aluno {
    //Definindo atributos
    int rm;
    String nome;
    String email;
    String usuario;
    String senha;

    //Definir os métodos
    void matricular(){
        //lógica de como matricular
        System.out.println("Aluno " + nome + " foi matriculado com sucesso");
    }
    void cancelarMatricular(){
        //Lógica de como cancelar um matrícula
        System.out.println("Aluno " + nome + " cancelou sua matrícula");
    }
    void transferirDeEscola(){
        //Lógica de como tranferir de escola
        System.out.println("Aluno " + nome + " teve deferimento de transferência");
    }
    void listarDadosAlunos() {
        //Mostrar os dados do aluno na tela, menos a senha
        System.out.println("Dados do aluno de rm: " + rm);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Usuário: " + usuario);
    }
}
