package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.itemPedido;
import modelo.umpramuitos.Pedido;

public class obterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);

        for(itemPedido item: pedido.getItens()) {
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }

        dao.fechar();
    }
}