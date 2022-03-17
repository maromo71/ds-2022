package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// contagem regressiva
        for(int i = 10; i > 0; i=i-2){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("FOGO");
    }
}
