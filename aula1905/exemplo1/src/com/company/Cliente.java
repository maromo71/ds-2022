package com.company;

public class Cliente {
    //Atributos ocultos - privados
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    //métodos públicos para o acesso
    public void definirCPF(String cpf){
        validarCPF(cpf);
        this.cpf = cpf;
        System.out.println("Cadastrei o cpf");
    }
    //validar o cpf
    private void validarCPF(String cpf){
        if(cpf.length()!=14)
            throw new IllegalArgumentException("CPF Inválido");
    }
}
