package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class alterarUsuario2 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("projJPA");
        EntityManager em = emf.createEntityManager();

        //contexto transacional(entidade no estado gerenciado)
        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Pedro");
        usuario.setEmail("pedro@contato.com.br");

        //Estado gerenciado é quando o jpa tem um gerenciamente em cima do objeto,
        //e que qlqer alteraçao que ocorra, o jpa ira sincronizar com o BD sem precisar chamar a funçao 'merge'.
       // em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();


    }

}
