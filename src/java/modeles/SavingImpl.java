/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Gaetan
 */
@Repository
public class SavingImpl implements Saving{

    @PersistenceContext(unitName="BankRootJPAPU")
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    @Transactional
    @Override
    public void save(SavingEntity a)
    {
       a = em.merge(a);
       em.persist(a);
    }
            
    
    @Transactional
    @Override
    public void update(SavingEntity a)
    {
       em.merge(a);
    }
    
    @Transactional
    @Override
    public void delete(SavingEntity a)
    {
       a = em.merge(a);
       em.remove(a);
    }
    
    
    @Transactional(readOnly=true)
    @Override
    public SavingEntity find(double account_id)
    {
        return em.find(SavingEntity.class, account_id);
    }
    
    @Transactional(readOnly=true)
    @Override
    public List<SavingEntity> findAll()
    {
        Query q = em.createQuery("SELECT a FROM AccountsEntity");
        return q.getResultList();
    }
    
    
        
}
