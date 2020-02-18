/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;


import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Gaetan
 */
public class AccountsImpl implements Accounts {
   private EntityManager em;

    public EntityManager getEm() {
        return em;
    }
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    @Transactional
    @Override
    public void save(AccountsEntity a)
    {
       a = em.merge(a);
       em.persist(a);
    }
            
    
    @Transactional
    @Override
    public void update(AccountsEntity a)
    {
       em.merge(a);
    }
    
    @Transactional
    @Override
    public void delete(AccountsEntity a)
    {
       a = em.merge(a);
       em.remove(a);
    }
    
    
    @Transactional(readOnly=true)
    @Override
    public AccountsEntity find(double account_id)
    {
        return em.find(AccountsEntity.class, account_id);
    }
    
    @Transactional(readOnly=true)
    @Override
    public List<AccountsEntity> findAll()
    {
        Query q = em.createQuery("SELECT a FROM AccountsEntity");
        return q.getResultList();
    }
}
