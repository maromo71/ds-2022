package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("Verificar se é triangulo");
        System.out.println("Digite o lado 1 \n");
        lado1 = Integer.parseInt(input.nextLine());
        System.out.println("Digite o lado 2\n");
        lado2 = Integer.parseInt(input.nextLine());
        System.out.println("Digite o lado 3\n");
        lado3 = Integer.parseInt(input.nextLine());
        if(eTriangunlo(lado1, lado2, lado3)){
            System.out.println(queTipoDeTrianguloE(lado1, lado2, lado3));
        }else{
            System.out.println("Não formam triangulo");
        }
    }

    public static boolean eTriangunlo(int a, int b, int c){
        if((a + b) > c && (a + c) > b && ( b+ c) > a){
            return true;
        }
        return false;
    }
    public static String queTipoDeTrianguloE(int a, int b, int c){
        if(a==b && a == c){
            return "Triangulo equilatero\n";
        }else{
            if(a!=b && a!=c && b!=c){
                return "Triangulo escaleno\n";
            }else{
                return "Triangulo isósceles\n";
            }
        }
    }
}
