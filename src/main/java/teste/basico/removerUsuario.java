package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class removerUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("projJPA");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 5L);

        if(usuario != null){
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        }


        em.close();
        emf.close();


    }
}
