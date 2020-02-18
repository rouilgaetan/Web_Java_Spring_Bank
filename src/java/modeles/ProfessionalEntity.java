/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.ArrayList;

/**
 *
 * @author Gaetan
 */
public class ProfessionalEntity extends UserEntity {
    private String referent_name;
    private double siret;
    private String company_name;
    private String address;
    
    ProfessionalEntity(String login, String mdp, String referent_name, double siret, String name, String address){
        super(login, mdp);
        this.referent_name=referent_name;
        this.siret=siret;
        this.company_name=name;
        this.address=address;
    }
}
