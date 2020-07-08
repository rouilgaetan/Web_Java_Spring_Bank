/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import modeles.ProfessionalEntity;

/**
 *
 * @author Gaetan Rouil
 */
public interface ProfessionalService {
    public ProfessionalEntity find(String id);
    public List<ProfessionalEntity> findAll();
    public void save(ProfessionalEntity entity);
    public void update(ProfessionalEntity entity);
    public void delete(ProfessionalEntity entity);
}
