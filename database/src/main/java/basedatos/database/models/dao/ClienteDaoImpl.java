package basedatos.database.models.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import models.enity.Cliente;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDaoImpl implements IClienteDao{
    
    @PersistenceContext
    private EntityManager em;
    @SuppressWarnings("unchecked")
    @Override
    public List<Cliente> findAll(){
        //TODO
        return em.createQuery("from Cliente").getResultList();
    }

    @Override
    public Cliente findOne(Long id){
        return em.find(Cliente.class, id) ;
    }

    @Override
    public void save(basedatos.database.models.entity.Cliente cliente){
        if(cliente.getId()!=null && cliente.getId()>0){
            em.merge(cliente);
        }else{
            em.persist(cliente);
        }
    }
    @Override
    public void delete(Long id){
        em.remove(findOne(id));
    }

}
