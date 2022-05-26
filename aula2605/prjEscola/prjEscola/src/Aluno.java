public class Aluno {
    private int rm;
    private String nome;
    private String email;
    private String turma;
    private int idade;

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazAniversario() {
        idade++;
    }

    public void matricular() {
        System.out.println("Aluno matriculado com sucesso");
        System.out.println("RM " + rm + ", nome: " + nome);
    }

    public void listarDados() {
        System.out.println("RM: " + rm);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Turma: " + turma);
        System.out.println("Idade: " + idade);

    }
}