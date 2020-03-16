/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gaetan
 */
@Entity
@DiscriminatorValue("Professional")
public class ProfessionalEntity extends UserEntity {
    
    @Column
    private String referent_name;
    
    @Column
    private double siret;
    
    @Column
    private String company_name;
    
    @Column
    private String address;
    
    ProfessionalEntity(){
        super();
    }
    
    ProfessionalEntity(String login, String mdp, String referent_name, double siret, String name, String address){
        super(login, mdp);
        this.referent_name=referent_name;
        this.siret=siret;
        this.company_name=name;
        this.address=address;
    }
    
}
