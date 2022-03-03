package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hora, minuto;
        System.out.println("Digite a hora [0 a 23]");
        hora = Integer.parseInt(input.nextLine());
        System.out.println("Digite o minuto [0 a 59");
        minuto = Integer.parseInt(input.nextLine());
        System.out.println("Resultado: " + converterHora(hora,minuto));
    }
    public static String converterHora(int hora, int minutos){
        String resultado;
        if(hora>11){
            hora = hora - 12;
            resultado = hora + ":" + minutos + " P.M.";
        }else{
            resultado = hora + ":" + minutos + " A.M.";
        }
        return resultado;
    }
}
