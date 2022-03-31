package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double n1, n2, media;
        System.out.println("Digite a primeira nota: ");
        n1 = Double.parseDouble(input.nextLine());
        System.out.println("Digite a segunda nota: ");
        n2 = Double.parseDouble(input.nextLine());
        media = calcularMedia(n1, n2);
        System.out.println("Média do aluno: " + media);
        if(media == 10){
            System.out.println("Aprovado com distinção");
        }else{
            if(media>=7){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
        }

    }
    public static double calcularMedia(double a, double b){
        return (a + b) /2;
    }
}
