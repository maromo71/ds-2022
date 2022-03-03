package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //declarar variaveis
        double peso, altura, imc;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.println("Digite a altura: ");
        altura = Double.parseDouble(input.nextLine());

        System.out.println("Seu imc é : " + calcularImc(peso, altura) );
    }

    static double calcularImc(double peso, double altura){
        return peso / (altura * altura);
    }
}
