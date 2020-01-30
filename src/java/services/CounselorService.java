/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.Calendar;
import modeles.User;

/**
 *
 * @author Gaetan
 */
public interface CounselorService {
    public void addParticular(String login, String mdp, String first_name, String last_name, String address, Calendar birth);
    public void addProfessional(String login, String mdp, String referent_name, double siret, String name, String address);
    
    public void addAccountsCurrent(User u, double credits, double account_id, Calendar creation_date);
    public void addAccountsSaving(User u, double credits, double account_id, Calendar creation_date, float interest_rate);
    
    
    public String getUsersAccounts();
    
    public String getUserAcounts(User u);
}
