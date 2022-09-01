package view;

import model.Velha;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmJogo {
    //contar as jogadas validas
    public static int contador = 0;
    private JPanel painelJogo;
    private JPanel grupo1;
    private JPanel grupo2;
    private JPanel grupo3;
    private JPanel grupoBotoes;
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btnNovoJogo;
    private JButton btnSair;

    public JPanel getPainelJogo() {
        return painelJogo;
    }
    public Velha jogo;

    public FrmJogo() {
        jogo = new Velha();

        btn0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(0, btn0);
            }
        });
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(1, btn1);
            }
        });
        btn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(2, btn2);
            }
        });
        btn3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(3, btn3);
            }
        });
        btn4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(4, btn4);
            }
        });
        btn5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(5, btn5);
            }
        });
        btn6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(6, btn6);
            }
        });
        btn7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(7, btn7);
            }
        });
        btn8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(8, btn8);
            }
        });
        btnNovoJogo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btn0.setText("");
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                contador = 0;
                jogo = new Velha();
            }
        });
        btnSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    private void jogar(int p, JButton btn) {
        //verificar se a posicao ja foi jogada
        //verificar de quem é a vez
        if(!(btn.getText().isEmpty()||btn.getText()==null)){
            JOptionPane.showMessageDialog(null,
                    "Aqui já foi jogado",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        contador++; //contando jogada valida
        if(contador % 2 == 0){ //par
            btn.setText("0");
        }else{ //impar
            btn.setText("X");
        }
        jogo.jogar(p, btn.getText().charAt(0));
    }
}
