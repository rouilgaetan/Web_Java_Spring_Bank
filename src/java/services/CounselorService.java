/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import modeles.CounselorEntity;

/**
 *
 * @author Gaetan
 */
public interface CounselorService {
    public CounselorEntity find(String id);
    public List<CounselorEntity> findAll();
    public void save(CounselorEntity u);
    public void update(CounselorEntity entity);
    public void delete(CounselorEntity entity);
}
