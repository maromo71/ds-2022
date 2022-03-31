package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double h;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        h = Double.parseDouble(input.nextLine());
        double pih = calcularPesoIdealH(h);
        double pim = calcularPesoIdealM(h);
        System.out.println("Peso ideal do homem: ");
        System.out.println(pih);
        System.out.println("Peso ideal da Mulher: ");
        System.out.println(pim);

    }
    public static double calcularPesoIdealH(double h){
        return 72.7 *h - 58;
    }
    public static double calcularPesoIdealM(double h){
        return 62.1 *h - 44.7;
    }
}
