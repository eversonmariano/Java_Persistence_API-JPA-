package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class novoUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("projJPA");
        EntityManager em = emf.createEntityManager();

        Usuario NovoUsuario = new Usuario("Bruno", "bruno@contato.com.br");

        em.getTransaction().begin();
        em.persist(NovoUsuario);
        em.getTransaction().commit();

        em.persist(NovoUsuario);

        em.close();
        emf.close();
    }
}
