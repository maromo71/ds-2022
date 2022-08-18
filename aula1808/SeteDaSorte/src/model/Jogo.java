package model;

import java.util.Random;

public class Jogo {

    private int num1;
    private int num2;
    private int num3;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    //método construtor
    public Jogo(){
        //logica para gerar os tres valores
        Random sorteio = new Random();
        num1 = sorteio.nextInt(10);
        num2 = sorteio.nextInt(10);
        num3 = sorteio.nextInt(10);
    }

    public String verResultado(){
        int contador = 0;
        if(num1==7) contador++;
        if(num2==7) contador++;
        if(num3==7) contador++;
        if(contador >= 2){
            return "Você venceu";
        }else{
            return "Você perdeu";
        }
    }
}
