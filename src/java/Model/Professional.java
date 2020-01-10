/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Gaetan
 */
public class Professional extends User {
    private double siret;
    private String company_name;
    private ArrayList<Accounts> accounts;
    
    Professional(String login, String mdp, double siret, String name){
        super(login, mdp);
        this.siret=siret;
        this.company_name=name;
        this.accounts=new ArrayList<>();
    }
}
