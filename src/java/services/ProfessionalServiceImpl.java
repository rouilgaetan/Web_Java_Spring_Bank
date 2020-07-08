/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import modeles.Professional;
import modeles.ProfessionalEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Gaetan Rouil
 */
public class ProfessionalServiceImpl implements ProfessionalService{
    
    @Autowired
    Professional p;

    @Override
    public ProfessionalEntity find(String id) {
        return p.find(id);
    }

    @Override
    public List<ProfessionalEntity> findAll() {
        return p.findAll();
    }

    @Override
    public void save(ProfessionalEntity entity) {
        this.p.save(entity);
    }

    @Override
    public void update(ProfessionalEntity entity) {
        this.p.update(entity);
    }

    @Override
    public void delete(ProfessionalEntity entity) {
        this.p.delete(entity);
    }
}
