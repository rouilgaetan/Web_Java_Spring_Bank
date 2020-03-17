/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import modeles.Counselor;
import modeles.CounselorEntity;
import modeles.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gaetan
 */
@Service
public class CounselorServiceImpl implements CounselorService{

    @Autowired
    Counselor c;

    @Override
    public CounselorEntity find(String id) {
        return c.find(id);
    }

    @Override
    public List<CounselorEntity> findAll() {
        return c.findAll();
    }

    @Override
    public void save(CounselorEntity u) {
        c.save(u);
    }

    @Override
    public void update(CounselorEntity entity) {
        c.update(entity);
    }

    @Override
    public void delete(CounselorEntity entity) {
        c.delete(entity);
    }

    
}
