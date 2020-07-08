package services;

import java.util.List;
import modeles.AccountsEntity;

/**
 *
 * @author Gaetan Rouil
 */
public interface AccountsService {
    public AccountsEntity find(double id);
    public List<AccountsEntity> findAll();
    public void save(AccountsEntity entity);
    public void update(AccountsEntity entity);
    public void delete(AccountsEntity entity);
}
