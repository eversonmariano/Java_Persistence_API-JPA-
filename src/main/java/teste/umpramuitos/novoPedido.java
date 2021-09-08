package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.Pedido;
import modelo.umpramuitos.itemPedido;

public class novoPedido {

    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geladeira", 2789.88);
        itemPedido item = new itemPedido(pedido, produto, 10);

        dao.abrirTrasacao()
                .incluir(produto)
                .incluir(pedido)
                .incluir(item)
                .fecharTrasacao()
                .fechar();



    }
}
