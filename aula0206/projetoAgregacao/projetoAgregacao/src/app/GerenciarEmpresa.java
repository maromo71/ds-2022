package app;

import modelo.Departamento;
import modelo.Endereco;
import modelo.Funcionario;

public class GerenciarEmpresa {
    public static void main(String[] args) throws InterruptedException {
        //Um Departamento
        //Um Endereco
        //Um Funcionario
        Departamento departamento = new Departamento();
        departamento.setCodDepto(1);
        departamento.setDescricao("TI");
        Endereco endereco = new Endereco();
        endereco.setRua("Rua XV de Novembro");
        endereco.setNumero("23");
        endereco.setCidade("Mogi Mirim");
        endereco.setEstado("SP");
        //Funcionario que mora neste endereco e trabalha em TI
        //é o Juca
        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(333);
        funcionario.setNome("Juca Bala");
        funcionario.setEndereco(endereco);
        funcionario.setDepartamento(departamento);
        funcionario.setSalario(5000);
        //Irmao do Juca é o Pedro
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setMatricula(444);
        funcionario2.setNome("Pedro Bala");
        funcionario2.setEndereco(endereco);
        funcionario2.setDepartamento(departamento);

        //Funcionario Juca entrada no servico
        funcionario.registrarEntrada();

        Thread.sleep(10000);
        funcionario.registrarSaida();

    }
}