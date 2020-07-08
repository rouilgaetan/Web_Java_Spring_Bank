package services;

import java.util.List;
import modeles.SavingEntity;

/**
 *
 * @author Gaetan Rouil
 */
public interface SavingService {
    public SavingEntity find(double id);
    public List<SavingEntity> findAll();
    public void save(SavingEntity entity);
    public void update(SavingEntity entity);
    public void delete(SavingEntity entity);
}
