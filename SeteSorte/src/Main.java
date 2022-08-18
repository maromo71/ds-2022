import view.FormSeteSorte;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame tela= new JFrame();
        tela.setContentPane(new FormSeteSorte().getPanelSeteSorte());
        tela.setSize(700,700);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}