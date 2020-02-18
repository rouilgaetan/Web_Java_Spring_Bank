/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Gaetan
 */
@Repository
public class CurrentImpl implements Current{

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    @Transactional
    @Override
    public void save(CurrentEntity a)
    {
       a = em.merge(a);
       em.persist(a);
    }
            
    
    @Transactional
    @Override
    public void update(CurrentEntity a)
    {
       em.merge(a);
    }
    
    @Transactional
    @Override
    public void delete(CurrentEntity a)
    {
       a = em.merge(a);
       em.remove(a);
    }
    
    
    @Transactional(readOnly=true)
    @Override
    public CurrentEntity find(double account_id)
    {
        return em.find(CurrentEntity.class, account_id);
    }
    
    @Transactional(readOnly=true)
    @Override
    public List<CurrentEntity> findAll()
    {
        Query q = em.createQuery("SELECT a FROM AccountsEntity");
        return q.getResultList();
    }
    
}
