package modelo.umpraum;

import infra.DAO;

public class novoClienteAssento2 {

    public static void main(String[] args) {

        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Manoel", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirEfetivar(cliente);


    }

}
