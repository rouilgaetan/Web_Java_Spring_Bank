/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import modeles.Accounts;
import modeles.User;
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
    public String getAccounts() {
        return u.displayAccounts();
    }

    @Override
    public String getAccountOperations(Accounts a) {
        return a.displayHistoric();
    }
    
}
