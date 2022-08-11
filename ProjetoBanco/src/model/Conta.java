package model;

public abstract class Conta {
    private int numConta;
    private String nomeCliente;
    private double saldo;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos para sacar e depositar
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }else {
            throw new IllegalArgumentException("Sem saldo para saque");
        }
    }

    public void imprimir(){
        System.out.println("Num. conta: " + numConta);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }
}
