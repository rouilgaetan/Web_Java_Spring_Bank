package services;

import java.util.List;
import modeles.Operations;
import modeles.OperationsEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Gaetan Rouil
 */
public class OperationsServiceImpl implements OperationsService {
    @Autowired
    Operations o;

    @Override
    public OperationsEntity find(double id) {
        return o.find(id);
    }

    @Override
    public List<OperationsEntity> findAll() {
        return o.findAll();
    }

    @Override
    public void save(OperationsEntity entity) {
        this.o.save(entity);
    }

    @Override
    public void update(OperationsEntity entity) {
        this.o.update(entity);
    }

    @Override
    public void delete(OperationsEntity entity) {
        this.o.delete(entity);
    }
}
