import model.Carro;
import model.Proprietario;

public class GerenciarEstacionamento {
    public static void main(String[] args) {
        Proprietario rubinho = new Proprietario(1,
                "Rubinho Barrichelo",
                "Rua Tal, 12",
                "São Paulo",
                "SP",
                "(11)98989-9898");
        //Definir os objetos carros que pertecem ao rubinho
        Carro ferrari = new Carro(1,
                "Ferrari XTS",
                "Ferrari",
                "XFC-0F01",
                500000.0);
        Carro fusca = new Carro(2,
                "Fusquinha 1300",
                "VW",
                "XFX-0F02",
                20000.0);
        //Precisa ligar os carros ao seu proprietario
        //vamos usar o método adicionarCarro
        rubinho.adicionarCarro(ferrari);
        rubinho.adicionarCarro(fusca);
        System.out.println(rubinho);
    }
}