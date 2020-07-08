package services;

import java.util.List;
import modeles.OperationsEntity;
/**
 *
 * @author Gaetan Rouil
 */
public interface OperationsService {
    public OperationsEntity find(double id);
    public List<OperationsEntity> findAll();
    public void save(OperationsEntity entity);
    public void update(OperationsEntity entity);
    public void delete(OperationsEntity entity);
}
