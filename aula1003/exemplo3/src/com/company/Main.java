package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero que deseja a tabuada: ");
        int numero = Integer.parseInt(input.nextLine());
	    //comando for
        for (int i = 1; i <= 10; i++) {
            int total = numero * i;
            System.out.println(numero + " X " + i + " = " + total );
        }
    }
}
