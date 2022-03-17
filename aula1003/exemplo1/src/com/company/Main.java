package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        while(total < 200){
            System.out.println("Digite um valor: ");
            int valor = Integer.parseInt(input.nextLine());
            if(valor % 2 ==1){
                total += valor;
            }
        }
        System.out.println("Somatória final: " + total);

    }
}
