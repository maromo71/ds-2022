package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, expoente;
        System.out.println("Digite o valor da base: ");
        base = Integer.parseInt(input.nextLine());
        System.out.println("Digite o expoente: ");
        expoente = Integer.parseInt(input.nextLine());
        long resultado = potencia(base, expoente);
        System.out.println("Resultado: " + resultado);
    }

    public static long potencia(int base, int expoente){
        int r = 1;
        for(int i =1; i<=expoente; i++){
            r*= base;
        }
        return r;
    }
}
