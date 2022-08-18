package view;

import model.Jogo;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmJogo {
    private JButton jogarButton;
    private JButton sairButton;
    private JPanel panelGame;
    private JLabel labelNum1;
    private JLabel labelNum2;
    private JLabel labelNum3;

    public FrmJogo() {
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        jogarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Jogo jogo = new Jogo();
                labelNum1.setText(Integer.toString(jogo.getNum1()));
                labelNum2.setText(Integer.toString(jogo.getNum2()));
                labelNum3.setText(Integer.toString(jogo.getNum3()));
                JOptionPane.showMessageDialog(null,
                        jogo.verResultado(),
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public JPanel getPanelGame() {
        return panelGame;
    }
}
