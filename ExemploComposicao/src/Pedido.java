import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    public int id_pedido;
    public Date data;
    public double valorDesconto;
    public List<ItemPedido> listaDePedidos = new ArrayList<>();
}
