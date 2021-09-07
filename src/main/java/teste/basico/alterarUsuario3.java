package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class alterarUsuario3 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("projJPA");
        EntityManager em = emf.createEntityManager();

        //contexto transacional(entidade no estado nao gerenciado)
        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);

        usuario.setNome("Bia");
        usuario.setEmail("bia@contato.com.br");

        em.detach(usuario);


        //Estado nao gerenciado para que qualquer alteraçao/atualizaçao nao ocorra chamamos a funçao detach,
        //  sobre o objeto no BD. Caso queiramos atualizar, chamaremos em seguida a funçao merge
        //  para garantir de fato a alteraçao.

        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();


    }


}
