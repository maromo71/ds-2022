package view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FSaudacao {
    private JPanel panelSaudacao;
    private JTextField textField1;
    private JTextField textField2;
    private JButton concatenarButton;
    private JButton sairButton;
    private JLabel label1;

    public FSaudacao() {
        concatenarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label1.setText(textField1.getText() + " " +
                        textField2.getText());
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getPanelSaudacao() {
        return panelSaudacao;
    }
}
