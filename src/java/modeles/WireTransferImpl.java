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
 * @author Gaetan Rouil
 */
@Repository
public class WireTransferImpl implements WireTransfer{
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
    public void save(WireTransferEntity a)
    {
       a = em.merge(a);
       em.persist(a);
    }
            
    
    @Transactional
    @Override
    public void update(WireTransferEntity a)
    {
       em.merge(a);
    }
    
    @Transactional
    @Override
    public void delete(WireTransferEntity a)
    {
       a = em.merge(a);
       em.remove(a);
    }
    
    
    @Transactional(readOnly=true)
    @Override
    public WireTransferEntity find(double id)
    {
        return em.find(WireTransferEntity.class, id);
    }
    
    @Transactional(readOnly=true)
    @Override
    public List<WireTransferEntity> findAll()
    {
        Query q = em.createQuery("SELECT a FROM UserEntity");
        return q.getResultList();
    }
}
