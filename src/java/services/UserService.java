/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import modeles.AccountsEntity;


/**
 *
 * @author Gaetan
 */
public interface UserService {
    
    public String getAccounts();
    
    public String getAccountOperations(AccountsEntity a);
    
}
