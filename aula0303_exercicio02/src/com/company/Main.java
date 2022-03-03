package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = Integer.parseInt(input.nextLine());
        char resultado = checarPositividade(valor);
        System.out.println("Letra retornada: " + resultado);
    }


    public static char checarPositividade(int num){
        if(num > 0 ){
            return 'P';
        }else{
            return 'N';
        }
    }
}
