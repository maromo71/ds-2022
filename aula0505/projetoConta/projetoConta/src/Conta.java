public class Conta {
    public int numero;
    public String cliente;
    private double saldo;

    public void depositar(double valor){
        if(valor <=0){
            System.out.println("Valor inválido");
        }else{
            saldo += valor;
        }
    }
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficente para o saque");
        }else{
            saldo -= valor;
        }
    }
    public double verSaldo(){
        return saldo;
    }

}
