package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        int magico = gerador.nextInt(1001); //entre 0 e 1000
        int palpite;
        int totalDeJogadas = 0;
        do{
            System.out.println("Digite seu palpite [entre 0 e 1000]: ");
            palpite = Integer.parseInt(input.nextLine());
            totalDeJogadas++;
            System.out.println("Vez: " + totalDeJogadas);
            if(palpite==magico){
                System.out.println("Parabéns colega, você acertou");
                break;
            }else {
                if(palpite < magico){
                    System.out.println("O número é maior");
                }else{
                    System.out.println("O número é menor");
                }
            }
            if(totalDeJogadas>=10) {
                System.out.println("Acabou o jogo, você errou...");
                System.out.println("O Número mágico era: " + magico);
                break;
            }
        }while(true);
    }
}
