package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Digite o primeiro valor");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Digite o segundo valor");
        num2 = Integer.parseInt(input.nextLine());
        System.out.println("Digite o terceiro valor");
        num3 = Integer.parseInt(input.nextLine());
        int resultado = somar(num1, num2, num3);
        System.out.println("Valor do soma: " + resultado);
    }

    public static int somar(int a, int b, int c){
        return a + b + c;
    }
}
