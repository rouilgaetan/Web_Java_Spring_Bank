/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author Gaetan
 */
@Entity
@DiscriminatorValue("Current")
public class CurrentEntity extends AccountsEntity{
    
    public CurrentEntity(){
        super();
    }
    
    public CurrentEntity(double credits, double account_id, Calendar creation_date){
        super(credits, account_id, creation_date);
    }
}
