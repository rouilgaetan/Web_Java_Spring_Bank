/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.io.Serializable;
import java.util.Calendar;
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
@DiscriminatorValue("Saving")
public class SavingEntity extends AccountsEntity{


   @Column
   private float interest_rate;
    
   public SavingEntity(){
       super();
   }
   
    public SavingEntity(double credits, double account_id, Calendar creation_date, float interest_rate){
        super(credits, account_id, creation_date);
        this.interest_rate=interest_rate;
    }
    
}
