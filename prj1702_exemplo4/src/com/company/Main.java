package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Programa para calcular a media de 03 valores
        Scanner leitor = new Scanner(System.in);
        int a, b, c, x;
        x = 3;
        System.out.println("Digite o valor de a: ");
        a = leitor.nextInt();
        System.out.println("Digite o valor de b: ");
        b = leitor.nextInt();
        System.out.println("Digite o valor de c: ");
        c = leitor.nextInt();
        //Na linha de baixo temos um cast (promoção de tipo)
        float media = (a + b + c) / (float)x;
        System.out.println("Média é: " + media);
    }
}
