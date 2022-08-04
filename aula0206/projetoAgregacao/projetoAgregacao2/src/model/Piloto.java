package model;

import java.util.Random;

public class Piloto {
    private int numero;
    private String nome;
    private Escuderia escuderia;
    private Pais paisOrigem;
    private int numerosDeGPs;
    private int numeroDeVitorias;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public Pais getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(Pais paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getNumerosDeGPs() {
        return numerosDeGPs;
    }

    public void setNumerosDeGPs(int numerosDeGPs) {
        this.numerosDeGPs = numerosDeGPs;
    }

    public int getNumeroDeVitorias() {
        return numeroDeVitorias;
    }

    public void setNumeroDeVitorias(int numeroDeVitorias) {
        this.numeroDeVitorias = numeroDeVitorias;
    }

    public void gerarTempo(int peso){
        Random r = new Random();
        double tempo = r.nextDouble();
        System.out.println("Tempo do piloto: " + peso * tempo);
    }

    public void imprimir(){
        System.out.println("Dados do piloto");
        System.out.println("Nome: " + nome);
        System.out.println("Equipe: " + escuderia.getDescricao());
        System.out.println("País de Origem: " + paisOrigem.getDescricao());

    }
}
