package view;

import model.SeteSorte;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormSeteSorte {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton jogarButton;
    private JPanel panelSeteSorte;

    public JPanel getPanelSeteSorte() {
        return panelSeteSorte;
    }

    public FormSeteSorte() {
        jogarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SeteSorte jogo = new SeteSorte();
                button1.setText(String.valueOf(jogo.getValor1()));
                button2.setText(String.valueOf(jogo.getValor2()));
                button3.setText(String.valueOf(jogo.getValor3()));
                checarVencedor();
            }


        });
    }

    private void checarVencedor() {
        int acertos = 0;
        if(button1.getText().equals("7")) acertos++;
        if(button2.getText().equals("7")) acertos++;
        if(button3.getText().equals("7")) acertos++;
        if(acertos>=2){
            JOptionPane.showMessageDialog(null,
                    "Parabéns!! Venceu",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Que pena!! Deu Banca",
                    "Resultado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
