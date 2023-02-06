/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;


import Dominio.Mylist;
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
public class MylistDao implements InterfazMylist {
     // El EJB se encarga de forma automática de hacer las transacciones.
    
    // Ahora inyectamos la unidad de persistencia a través del API de JPA
    // Simplemente tenemos que usar la anotación e indicar el nombre de nuestra
    // unidad de persistencia
    @PersistenceContext(unitName="animeproject")
    EntityManager em;
    
    // Con este objeto de em ya podemos interactuar con nuestra BD
   
    @Override
    public List<Mylist> findAllMylist() {
        // Creamos un NamedQuery, y el listado lo leemos con getResultList
        // Por lo que estamos escribiendo menos código
        return em.createNamedQuery("Mylist.findAll").getResultList();
    }

   
    @Override
    public Mylist findMylistByID(Mylist mylist) {
        // Especificamos la clase que queremos buscar y luego el campo por el 
        // que queremos buscar
        return em.find(Mylist.class, mylist.getIdmylist());
    }

    
    @Override
    public Mylist findMylistByUser(Mylist mylist) {
        // En este caso no vamos a usar un NamedQuery, que podríamos haber 
        // agregado en la Entidad de Persona sino que vamos a incluirlo directamente.
        Query query = em.createQuery("from Mylist c where c.iduserFK= :iduserFK");
        query.setParameter("title", mylist.getIduserFK());
        // Y ahroa sólo esperamos un resultado, porque el email debe de ser único
        // sino lo hemos definido así lo modificamos en nuestra tabla como unique
        return (Mylist) query.getSingleResult();
    }

    
    @Override
    public void insert(Mylist mylist) {
        em.persist(mylist);
    }

    
    @Override
    public void updateMylist(Mylist mylist){
        // Sincroniza cualquier modificamos que hayamos hecho de la persona en la BD
        em.merge(mylist);
    }
    
    @Override
    public void deleteMylist(Mylist mylist) {
        // 1. actualizamos el estado del objeto en la base de datos => se borra.
        em.remove(em.merge(mylist));
    }
}