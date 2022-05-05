import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        //Criar um objeto tipo Scanner
        Scanner input = new Scanner(System.in);
        //Criar uma nova conta
        Conta conta1 = new Conta();
        //mostrar a frase digite o numero da conta
        System.out.println("Digite o numero da conta: ");
        //Ler o numero digitado e colocar no numero da conta do objeto criado
        conta1.numero = Integer.parseInt(input.nextLine());
        //mostrar a frase digite o nome do cliente
        System.out.println("Digite o nome do cliente: ");
        //Ler o nome digitado e colocar no nome do cliente no objeto criado
        conta1.cliente = input.nextLine();
        //mostrar a frase digite o valor do deposito
        System.out.println("Digite o valor a ser depositado: ");
        double valor = Double.parseDouble(input.nextLine());
        //invocar o método depositar e passar o valor
        conta1.depositar(valor);
        //mostrar a frase digite o valor do saque
        System.out.println("Digite o valor a ser sacado: ");
        valor = Double.parseDouble(input.nextLine());
        //invocar o método sacar e passar o valor
        conta1.sacar(valor);
        //exibir o saldo
        //invocar o método verSaldo para mostrar o saldo do cliente.
        System.out.println("Saldo da conta: " + conta1.verSaldo());
    }
}
