package model;

public class Corrente extends Conta{
    private double limiteCheque;

    public double getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(double limiteCheque) {
        this.limiteCheque = limiteCheque;
    }

    public void imprimir(){
        System.out.println("Dados da Conta Corrente");
        super.imprimir();
        System.out.println("Limite de Cheque: " + limiteCheque +"\n");
    }

    @Override
    public void sacar(double valor) {
        if(valor <(getSaldo() + limiteCheque)){
            setSaldo(getSaldo() - valor);
        }else{
            throw new IllegalArgumentException("Sem saldo e sem limite");
        }
    }
}
