/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import modeles.AccountsEntity;
import modeles.User;
import modeles.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gaetan
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    User u;

    @Override
    public UserEntity find(String id) {
        return u.find(id);
    }

    @Override
    public List<UserEntity> findAll() {
        return u.findAll();
    }

    @Override
    public void save(UserEntity u) {
        this.u.save(u);
    }

    @Override
    public void update(UserEntity entity) {
        this.u.update(entity);
    }

    @Override
    public void delete(UserEntity entity) {
        this.u.delete(entity);
    }
   
}
