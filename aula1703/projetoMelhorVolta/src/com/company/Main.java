package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tempoDaVolta, tempoMelhorVolta=0, somaTempoDasVoltas=0;
        int numeroDeVolta, melhorVolta=0;
        System.out.println("Digite o numero de voltas a ser computada ?");
        numeroDeVolta = Integer.parseInt(input.nextLine());
        for(int i=1; i<=numeroDeVolta; i++){
            System.out.println("Digite o tempo da volta " + i + ":");
            tempoDaVolta = Double.parseDouble(input.nextLine());
            somaTempoDasVoltas += tempoDaVolta;
            if(i==1){
                //se for a primeira volta
                melhorVolta = 1;
                tempoMelhorVolta = tempoDaVolta;
            }else{
                if(tempoDaVolta < tempoMelhorVolta){
                    tempoMelhorVolta = tempoDaVolta;
                    melhorVolta = i;
                }
            }
        }
        double mediaDasVoltas = somaTempoDasVoltas / numeroDeVolta;
        System.out.println("Melhor volta foi a :  " + melhorVolta);
        System.out.println("Tempo da Melhor volta: " + tempoMelhorVolta);
        System.out.println("Média dos tempos das voltas: " + mediaDasVoltas);

    }
}
