package model;

import javax.swing.*;

public class Velha {
    private char tabuleiro[][] = new char[3][3];
    
    public void jogar(int posicao, char jogador){
        int coluna = posicao % 3;
        int linha = posicao / 3;
        tabuleiro[linha][coluna] = jogador;
        verificarVencedor();
    }
    public void verificarVencedor(){
        String mensagem = "";
        boolean vencedor = false;
        char jog = 'X';
        for(int i=0; i<2; i++){
            jog = i==0 ? 'X' : '0';
            //verificar se jogador (jog) venceu
            if(tabuleiro[0][0]==jog && tabuleiro[0][1]==jog && tabuleiro[0][2]==jog){
                mensagem = "Jogador " + jog + " Venceu";
                vencedor = true;
                break;
            }
            if(tabuleiro[1][0]==jog && tabuleiro[1][1]==jog && tabuleiro[1][2]==jog){
                mensagem = "Jogador " + jog + " Venceu";
                vencedor = true;
                break;
            }
            if(tabuleiro[2][0]==jog && tabuleiro[2][1]==jog && tabuleiro[2][2]==jog){
                mensagem = "Jogador " + jog + " Venceu";
                vencedor = true;
                break;
            }
            if(tabuleiro[0][0]==jog && tabuleiro[1][0]==jog && tabuleiro[2][0]==jog){
                mensagem = "Jogador " + jog + " Venceu";
                vencedor = true;
                break;
            }
            if(tabuleiro[0][1]==jog && tabuleiro[1][1]==jog && tabuleiro[2][1]==jog){
                mensagem = "Jogador " + jog + " Venceu";
                vencedor = true;
                break;
            }
            if(tabuleiro[0][0]==jog && tabuleiro[1][1]==jog && tabuleiro[2][2]==jog){
                mensagem = "Jogador " + jog + " Venceu";
                vencedor = true;
                break;
            }
            if(tabuleiro[2][0]==jog && tabuleiro[1][1]==jog && tabuleiro[0][2]==jog){
                mensagem = "Jogador " + jog + " Venceu";
                vencedor = true;
                break;
            }    
        }
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(tabuleiro[i][j]!=0){
                    cont++;
                }
            }
        }
        if(vencedor) {
            JOptionPane.showMessageDialog(null,
                    mensagem,
                    "Venceu",
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(cont==9){
                JOptionPane.showMessageDialog(null,
                        "Deu Veía",
                        "Venceu",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
