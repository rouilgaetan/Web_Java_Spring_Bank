package services;

import java.util.List;
import modeles.WireTransfer;
import modeles.WireTransferEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Gaetan Rouil
 */
public class WireTransferServiceImpl implements WireTransferService{
    @Autowired
    WireTransfer w;

    @Override
    public WireTransferEntity find(double id) {
        return w.find(id);
    }

    @Override
    public List<WireTransferEntity> findAll() {
        return w.findAll();
    }

    @Override
    public void save(WireTransferEntity entity) {
        this.w.save(entity);
    }

    @Override
    public void update(WireTransferEntity entity) {
        this.w.update(entity);
    }

    @Override
    public void delete(WireTransferEntity entity) {
        this.w.delete(entity);
    }
}
