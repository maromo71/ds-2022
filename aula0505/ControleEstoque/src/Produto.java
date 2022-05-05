public class Produto {
    //Atributos
    public int codigo;
    public String descricao;
    public double preco;
    public int quantidadeEstoque;

    //Métodos
    public void registrarEntrada(int qtd){
        quantidadeEstoque += qtd;
    }
    public void registrarSaida(int qtd){
        quantidadeEstoque -= qtd;
    }
    public void mostrarProduto(){
        System.out.println("Código do Produto = " + codigo);
        System.out.println("Descrição do Produto = " + descricao);
        System.out.println("Preço = " + preco);
        System.out.println("Quantidade em Estoque = " + quantidadeEstoque);
    }
}
