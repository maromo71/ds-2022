package model;

//Sample: Class Diagram for 1DS B - Tarde

/**
 * @author Leandro e Maromo
 * @since 2022 august
 */
public class Pessoa {
    public String nome;
    public String endereco;
    public String idade;

    public String imprimirDados(){
        return "Nome: " + nome  + "\n" +
                "Endereço: " + endereco +"\n" +
                "Idade: " + idade + "\n";
    }
}
