/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.Calendar;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Gaetan Rouil
 */
@Entity
@DiscriminatorValue("Wire Transfer")
public class WireTransferEntity extends OperationsEntity {
    
    @ManyToOne
    @JoinColumn(name="accounts_credit_fk")
    private AccountsEntity credited;

    public WireTransferEntity() {
    }
    
    public WireTransferEntity(double id, double amount, AccountsEntity debit, Calendar date, AccountsEntity receiver){
        super(id, amount, debit, date);
        this.credited=receiver;
    }
    
    public void transfer(){
        this.getDebited().setCredits(this.getDebited().getCredits()-this.getAmount());
        this.credited.setCredits(this.credited.getCredits()+this.getAmount());
    }
}
