package org.example;


import org.example.view.ContatoView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(new ContatoView().getPainelContato());
        tela.setSize(350,450);
        tela.setTitle("Manutenção de Contatos");
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}