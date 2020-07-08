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
public interface Professional {
    public void save(ProfessionalEntity a);
    public void update(ProfessionalEntity a);
    public void delete(ProfessionalEntity a);
    public ProfessionalEntity find(String login);
    public List<ProfessionalEntity> findAll();
}
