/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import modeles.Particular;
import modeles.ParticularEntity;
import modeles.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Gaetan Rouil
 */
public class ParticularServiceImpl implements ParticularService{

    @Autowired
    Particular p;

    @Override
    public ParticularEntity find(String id) {
        return p.find(id);
    }

    @Override
    public List<ParticularEntity> findAll() {
        return p.findAll();
    }

    @Override
    public void save(ParticularEntity entity) {
        this.p.save(entity);
    }

    @Override
    public void update(ParticularEntity entity) {
        this.p.update(entity);
    }

    @Override
    public void delete(ParticularEntity entity) {
        this.p.delete(entity);
    }
    
}
