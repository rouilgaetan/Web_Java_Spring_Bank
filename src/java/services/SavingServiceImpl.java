package services;

import java.util.List;
import modeles.Saving;
import modeles.SavingEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Gaetan Rouil
 */
public class SavingServiceImpl implements SavingService {
    @Autowired
    Saving s;

    @Override
    public SavingEntity find(double id) {
        return s.find(id);
    }

    @Override
    public List<SavingEntity> findAll() {
        return s.findAll();
    }

    @Override
    public void save(SavingEntity entity) {
        this.s.save(entity);
    }

    @Override
    public void update(SavingEntity entity) {
        this.s.update(entity);
    }

    @Override
    public void delete(SavingEntity entity) {
        this.s.delete(entity);
    }
}
