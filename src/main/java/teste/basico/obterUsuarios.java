package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

//Está classe obtem usuarios a partir do banco de dados através do objeto (jpql)
public class obterUsuarios {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("projJPA");
        EntityManager em = emf.createEntityManager();

        String jpql = "select u from Usuario u";
        //Consulta por tipo (TypedQuery)
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();

        for(Usuario usuario: usuarios){
            System.out.println("ID: " + usuario.getId() + " email: " + usuario.getEmail());
        }

    em.close();
        emf.close();

    }

}
