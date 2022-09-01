import view.FrmJogo;

import javax.swing.*;

public class GerenciarJogo {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(new FrmJogo().getPainelJogo());
        tela.setSize(500, 600);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setTitle("Jogo da Velha");
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}