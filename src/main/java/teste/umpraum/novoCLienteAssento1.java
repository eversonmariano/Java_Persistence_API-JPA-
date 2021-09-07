package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class novoCLienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("63R");
        Cliente cliente = new Cliente("Lima", assento);

        DAO<Object> dao = new DAO<>();

        dao.abriTrasacao()
                .incluir(assento)
                .incluir(cliente)
                .fecharTrasacao()
                .fechar();



    }
}
