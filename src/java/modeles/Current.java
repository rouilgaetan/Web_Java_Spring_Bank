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
public interface Current {
    public void save(CurrentEntity a);
    public void update(CurrentEntity a);
    public void delete(CurrentEntity a);
    public CurrentEntity find(double account_id);
    public List<CurrentEntity> findAll();
}
