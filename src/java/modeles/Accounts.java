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
public interface Accounts {
    public void save(AccountsEntity a);
    public void update(AccountsEntity a);
    public void delete(AccountsEntity a);
    public AccountsEntity find(double account_id);
    public List<AccountsEntity> findAll();
}
