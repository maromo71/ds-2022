package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorVendas, taxaImpostos;
        System.out.println("Digite o valor total das vendas: ");
        valorVendas = Double.parseDouble(input.nextLine());

        System.out.println("Digite o % de imposto: ");
        taxaImpostos = Double.parseDouble(input.nextLine());

        double resultado = somaImposto(taxaImpostos, valorVendas);
        System.out.println("Resultado com impostos: " + resultado);
    }

    public static double somaImposto(double taxaImpostos, double valorVendas){
        return valorVendas + (valorVendas * taxaImpostos/100);
    }

}
