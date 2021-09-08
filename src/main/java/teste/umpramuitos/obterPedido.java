package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.Pedido;
import modelo.umpramuitos.itemPedido;

public class obterPedido {
    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);


        dao.fechar();
    }
}
