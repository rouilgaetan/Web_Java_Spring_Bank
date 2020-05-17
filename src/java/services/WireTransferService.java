package services;

import java.util.List;
import modeles.WireTransferEntity;

/**
 *
 * @author Gaetan Rouil
 */
public interface WireTransferService {
    public WireTransferEntity find(double id);
    public List<WireTransferEntity> findAll();
    public void save(WireTransferEntity entity);
    public void update(WireTransferEntity entity);
    public void delete(WireTransferEntity entity);
}
