public class Teste {
    //O Main inicialmente fica vazio
    public static void main(String[] args) {
        //Definir dois alunos, matricular os dois, cancelar a matricula do segundo
        //mostrar os dados do primeiro
        Aluno alunoJoao = new Aluno();
        Aluno alunoPedro = new Aluno();
        alunoJoao.rm = 1234;
        alunoJoao.nome = "João Antonio da Silva";
        alunoJoao.email = "emaildojoao@hotmail.com";
        alunoJoao.usuario = "usujoao";
        alunoJoao.senha = "12345";

        alunoPedro.rm = 2345;
        alunoPedro.nome = "Pedro Oscar de Souza";
        alunoPedro.email = "emaildopedro@gmail.com";
        alunoPedro.usuario = "usupedro";
        alunoPedro.senha = "1456";

        alunoJoao.matricular();
        alunoPedro.matricular();

        alunoPedro.cancelarMatricular();

        alunoJoao.listarDadosAlunos();

    }

}