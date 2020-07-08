package services;

import java.util.List;
import modeles.CurrentEntity;

/**
 *
 * @author Gaetan Rouil
 */
public interface CurrentService {
    public CurrentEntity find(double id);
    public List<CurrentEntity> findAll();
    public void save(CurrentEntity entity);
    public void update(CurrentEntity entity);
    public void delete(CurrentEntity entity);
}
