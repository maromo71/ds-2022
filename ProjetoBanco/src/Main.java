import model.Conta;
import model.Corrente;
import model.Poupanca;

public class Main {
    public static void main(String[] args) {
        //Vamos abrir uma poupanca e uma conta corrente
        Corrente conta1 = new Corrente();
        Poupanca conta2 = new Poupanca();
        conta1.setNumConta(1);
        conta1.setNomeCliente("Ana de Carvalho");
        conta1.setLimiteCheque(1000.00);
        conta1.depositar(1500.00);
        conta1.sacar(1501);
        conta1.imprimir();

        conta2.setNumConta(2);
        conta2.setNomeCliente("Bruno");
        conta2.setDiaAniversario(11);
        conta2.depositar(15.00);
        conta2.sacar(30.00);
        conta2.imprimir();
    }
}