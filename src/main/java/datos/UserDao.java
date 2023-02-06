/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import Dominio.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alumno Mañana
 */

@Stateless
public class UserDao implements InterfazUsuario {
     // El EJB se encarga de forma automática de hacer las transacciones.
    
    // Ahora inyectamos la unidad de persistencia a través del API de JPA
    // Simplemente tenemos que usar la anotación e indicar el nombre de nuestra
    // unidad de persistencia
    @PersistenceContext(unitName="animeproject")
    EntityManager em;
    
    // Con este objeto de em ya podemos interactuar con nuestra BD
   
    @Override
    public List<User> findAllUser() {
        // Creamos un NamedQuery, y el listado lo leemos con getResultList
        // Por lo que estamos escribiendo menos código
        return em.createNamedQuery("User.findAll").getResultList();
    }

   
    @Override
    public User findUserByID(User user) {
        // Especificamos la clase que queremos buscar y luego el campo por el 
        // que queremos buscar
        return em.find(User.class, user.getIduser());
    }

    
    @Override
    public User findUserByEmail(User user) {
        // En este caso no vamos a usar un NamedQuery, que podríamos haber 
        // agregado en la Entidad de Persona sino que vamos a incluirlo directamente.
        Query query = em.createQuery("from User u where u.email= :email");
        query.setParameter("email", user.getEmail());
        // Y ahroa sólo esperamos un resultado, porque el email debe de ser único
        // sino lo hemos definido así lo modificamos en nuestra tabla como unique
        return (User) query.getSingleResult();
    }

    
    @Override
    public void insert(User user) {
        em.persist(user);
    }

    
    @Override
    public void updateUser(User user){
        // Sincroniza cualquier modificamos que hayamos hecho de la persona en la BD
        em.merge(user);
    }
    
    @Override
    public void deleteUser(User user) {
        // 1. actualizamos el estado del objeto en la base de datos => se borra.
        em.remove(em.merge(user));
    }
}