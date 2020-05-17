/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import modeles.UserEntity;


/**
 *
 * @author Gaetan
 */
public interface UserService {
    
    public UserEntity find(String id);
    public List<UserEntity> findAll();
    public void save(UserEntity u);
    public void update(UserEntity entity);
    public void delete(UserEntity entity);
    
}
