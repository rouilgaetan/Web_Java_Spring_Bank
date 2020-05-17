package services;

import java.util.List;
import modeles.Accounts;
import modeles.AccountsEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Gaetan Rouil
 */
public class AccountsServiceImpl implements AccountsService{
    @Autowired
    Accounts a;

    @Override
    public AccountsEntity find(double id) {
        return a.find(id);
    }

    @Override
    public List<AccountsEntity> findAll() {
        return a.findAll();
    }

    @Override
    public void save(AccountsEntity entity) {
        this.a.save(entity);
    }

    @Override
    public void update(AccountsEntity entity) {
        this.a.update(entity);
    }

    @Override
    public void delete(AccountsEntity entity) {
        this.a.delete(entity);
    }
}
