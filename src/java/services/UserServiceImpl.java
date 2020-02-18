/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import modeles.AccountsEntity;
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
    UserEntity u;
    
    
    @Override
    public String getAccounts() {
        return u.displayAccounts();
    }

    @Override
    public String getAccountOperations(AccountsEntity a) {
        return a.displayHistoric();
    }
    
}
