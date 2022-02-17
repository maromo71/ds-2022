package com.company;


import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Programa que recebe dados do usuário
        Scanner leitor = new Scanner(System.in);
        int a, b;


        a = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Digite o valor de a: "));

        b = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Digite o valor de b: "));

        int soma = a + b;
        JOptionPane.showMessageDialog(
                null,
                "Resultado da Soma de a com b: " + soma,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
