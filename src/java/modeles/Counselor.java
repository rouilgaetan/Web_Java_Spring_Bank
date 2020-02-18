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
public interface Counselor {
    public void save(CounselorEntity a);
    public void update(CounselorEntity a);
    public void delete(CounselorEntity a);
    public UserEntity find(String login);
    public List<CounselorEntity> findAll();
}
