package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    //programa sete da sorte
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        Random gerador = new Random();
        int credito = gerador.nextInt(15001);

        do{
            int totalDeAcertos = 0;
            System.out.println("Seu limite para este jogo: " + credito);
            System.out.println("Quanto você quer apostar ?");
            int aposta = Integer.parseInt(input.nextLine());
            if(aposta > credito){
                System.out.println("Não pode jogar este valor. Sem limite");
                continue;
            }
            credito -= aposta;
            if(credito<0){
                System.out.println("Que pena acabou!!!");
                break;
            }
            num1 = gerador.nextInt(10);
            if(num1 == 7) totalDeAcertos++;
            num2 = gerador.nextInt(10);
            if(num2 == 7) totalDeAcertos++;
            num3 = gerador.nextInt(10);
            if(num3 == 7) totalDeAcertos++;
            System.out.print(num1 + "  ");
            Thread.sleep(500);
            System.out.print(num2 + "  ");
            Thread.sleep(500);
            System.out.println(num3 + "\n");
            if(totalDeAcertos==3){
                System.out.println("Estorou a banca, pegue a GRANA alta");
            }else{
                if(totalDeAcertos==2){
                    System.out.println("Seu prêmio é de R$ " + aposta * 500);
                }else{
                    System.out.println("Você dançou!! A banca ganhou sua grana");
                }
            }
        }while(credito > 0);
        System.out.println("Fim do jogo");
    }
}
