package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class alterarUsuario1 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("projJPA");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 1L);
        usuario.setNome("Elll");
        usuario.setEmail("elll@contato.com.br");

        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();


    }


}
