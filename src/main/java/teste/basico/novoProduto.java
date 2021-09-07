package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class novoProduto {
    public static void main(String[] args) {

        Produto produto = new Produto("Monitor 29", 5020.0);

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.incluirEfetivar(produto).fechar();
    }
}
