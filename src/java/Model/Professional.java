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
    private String referent_name;
    private double siret;
    private String company_name;
    private String address;
    
    Professional(String login, String mdp, String referent_name, double siret, String name, String address, String first_name, String last_name){
        super(login, mdp, first_name, last_name);
        this.referent_name=referent_name;
        this.siret=siret;
        this.company_name=name;
        this.address=address;
    }
}
