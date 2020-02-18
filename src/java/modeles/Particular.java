/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.List;

/**
 *
 * @author Gaetan
 */
public interface Particular {
    public void save(ParticularEntity a);
    public void update(ParticularEntity a);
    public void delete(ParticularEntity a);
    public ParticularEntity find(String login);
    public List<ParticularEntity> findAll();
}
