package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funcionario {
    private int matricula;
    private String nome;
    private Endereco endereco;
    private Departamento departamento;
    private double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void registrarEntrada(){
        System.out.println("Data e hora de entrada do " + nome);
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
        System.out.println();
    }

    public void registrarSaida(){
        System.out.println("Data e hora de saida do " + nome );
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
        System.out.println();
    }
}
