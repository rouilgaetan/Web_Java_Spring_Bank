/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.Calendar;
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
    CounselorEntity c;
    
    @Override
    public void addParticular(String login, String mdp, String first_name, String last_name, String address, Calendar birth) {
        c.createParticular(login, mdp, first_name, last_name, address, birth);
    }

    @Override
    public void addProfessional(String login, String mdp, String referent_name, double siret, String name, String address) {
        c.createProfessional(login, mdp, referent_name, siret, name, address);
    }

    @Override
    public void addAccountsCurrent(UserEntity u, double credits, double account_id, Calendar creation_date) {
        c.createCurrent(u, credits, account_id, creation_date);
    }

    @Override
    public void addAccountsSaving(UserEntity u, double credits, double account_id, Calendar creation_date, float interest_rate) {
        c.createSaving(u, credits, account_id, creation_date, interest_rate);
    }

    @Override
    public String getUsersAccounts() {
        return c.getUsersAccounts();
    }

    @Override
    public String getUserAcounts(UserEntity u) {
        if(c.getClients().contains(u)){
            return "Ce client existe";
        }
        else return "Ce client n'existe pas";
    }
    
}
