public class Main {
    public static void main(String[] args) {
        Produto p1, p2, p3;
        p1 = new Produto();
        p1.codigo = 1;
        p1.descricao = "Fanta Laranja - 2 Litros";
        p1.preco = 6.23;

        p2 = new Produto();
        p2.codigo = 2;
        p2.descricao = "Coca-cola - 2 Litros";
        p2.preco = 9.76;

        p3 = new Produto();
        p3.codigo = 3;
        p3.descricao = "Guaraná Antartica - 2 Litros";
        p3.preco = 7.78;

        p1.mostrarProduto();
        System.out.println();

        p2.mostrarProduto();
        System.out.println();

        p3.mostrarProduto();
        System.out.println();

        p1.registrarEntrada(100);
        p1.registrarSaida(50);

        p2.registrarEntrada(100);
        p2.registrarSaida(30);

        p3.registrarEntrada(100);
        p3.registrarSaida(80);

        p1.mostrarProduto();
        System.out.println();

        p2.mostrarProduto();
        System.out.println();

        p3.mostrarProduto();
        System.out.println();

    }
}