/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import modeles.ParticularEntity;

/**
 *
 * @author Gaetan Rouil
 */
public interface ParticularService {
    public ParticularEntity find(String id);
    public List<ParticularEntity> findAll();
    public void save(ParticularEntity entity);
    public void update(ParticularEntity entity);
    public void delete(ParticularEntity entity);
}
