/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Gaetan
 */
public class UserImpl implements User{

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    @Transactional
    @Override
    public void save(UserEntity a)
    {
       a = em.merge(a);
       em.persist(a);
    }
            
    
    @Transactional
    @Override
    public void update(UserEntity a)
    {
       em.merge(a);
    }
    
    @Transactional
    @Override
    public void delete(UserEntity a)
    {
       a = em.merge(a);
       em.remove(a);
    }
    
    
    @Transactional(readOnly=true)
    @Override
    public UserEntity find(String login)
    {
        return em.find(UserEntity.class, login);
    }
    
    @Transactional(readOnly=true)
    @Override
    public List<UserEntity> findAll()
    {
        Query q = em.createQuery("SELECT a FROM UserEntity");
        return q.getResultList();
    }
    
}
