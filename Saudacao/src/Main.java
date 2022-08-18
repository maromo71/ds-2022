import view.FSaudacao;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(new FSaudacao().getPanelSaudacao());
        tela.setSize(500,180);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}