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
public interface Operations {
    public void save(OperationsEntity a);
    public void update(OperationsEntity a);
    public void delete(OperationsEntity a);
    public OperationsEntity find(double id);
    public List<OperationsEntity> findAll();
}
