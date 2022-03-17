package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        double valor = 0.0;
        //montar o menu
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Café");
            System.out.println("2. Leite");
            System.out.println("3. Guaraná");
            System.out.println("9. SAIR");
            System.out.println("Escolha a opção: ");
            opcao = Integer.parseInt(input.nextLine());
            switch(opcao){
                case 1:
                    valor+= 5.0;
                    System.out.println("Café R$ 5.00 - Pedido");
                    break;
                case 2:
                    valor+=6.0;
                    System.out.println("Leite R$ 6.00 - Pedido");
                    break;
                case 3:
                    valor+=8.0;
                    System.out.println("Guaraná R$ 8.00 - Pedido");
                    break;
                case 9:
                    System.out.println("Fechado. Valor a pagar: " + valor);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);

    }
}
