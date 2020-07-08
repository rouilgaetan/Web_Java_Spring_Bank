/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.List;

/**
 *
 * @author Gaetan Rouil
 */
public interface WireTransfer {
    public void save(WireTransferEntity a);
    public void update(WireTransferEntity a);
    public void delete(WireTransferEntity a);
    public WireTransferEntity find(double id);
    public List<WireTransferEntity> findAll();
}
