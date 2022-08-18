package model;

import java.util.Random;

public class SeteSorte {
    private int valor1;
    private int valor2;
    private int valor3;

    public SeteSorte(){
        Random r =new Random();
        valor1 = r.nextInt(0,9);
        valor2 = r.nextInt(0,9);
        valor3 = r.nextInt(0,9);
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getValor3() {
        return valor3;
    }
}
