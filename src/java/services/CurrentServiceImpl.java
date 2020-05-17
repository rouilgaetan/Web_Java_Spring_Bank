package services;

import java.util.List;
import modeles.Current;
import modeles.CurrentEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Gaetan Rouil
 */
public class CurrentServiceImpl implements CurrentService{
    @Autowired
    Current c;

    @Override
    public CurrentEntity find(double id) {
        return c.find(id);
    }

    @Override
    public List<CurrentEntity> findAll() {
        return c.findAll();
    }

    @Override
    public void save(CurrentEntity entity) {
        this.c.save(entity);
    }

    @Override
    public void update(CurrentEntity entity) {
        this.c.update(entity);
    }

    @Override
    public void delete(CurrentEntity entity) {
        this.c.delete(entity);
    }
}
