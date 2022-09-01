package model;

public class Funcionario extends Pessoa {
    public double salario;
    public Cargo cargo;

    public double obterSalario(){
        return 10000.0;
    }

    @Override
    public String imprimirDados() {
        return super.imprimirDados() +
                "Salario: " + "\n" +
                "Cargo: " + cargo.imprimirDados();
    }

}
