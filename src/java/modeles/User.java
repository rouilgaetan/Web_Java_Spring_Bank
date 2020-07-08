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
public interface User {
    public void save(UserEntity a);
    public void update(UserEntity a);
    public void delete(UserEntity a);
    public UserEntity find(String login);
    public List<UserEntity> findAll();
}
