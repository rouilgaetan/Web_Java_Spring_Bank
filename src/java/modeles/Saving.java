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
public interface Saving {
    public void save(SavingEntity a);
    public void update(SavingEntity a);
    public void delete(SavingEntity a);
    public SavingEntity find(double account_id);
    public List<SavingEntity> findAll();
}
