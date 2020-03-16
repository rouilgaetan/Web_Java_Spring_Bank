/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author Gaetan
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="operationstype",discriminatorType
=DiscriminatorType.STRING)
@DiscriminatorValue("Operations")
public class OperationsEntity implements Serializable {

    @Id
    private double id;
    
    @Column
    private final double AMOUNT;
    
    @JoinColumn
    private final AccountsEntity DEBITED;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar date_of;
    
    public OperationsEntity(){
        this.id=0;
        this.AMOUNT=0;
        this.date_of.set(1, 1, 2001); 
        this.DEBITED=new AccountsEntity();
    }
    
    
    public OperationsEntity(double id, double amount, AccountsEntity debit, Calendar date){
        this.id=id;
        this.AMOUNT=amount;
        this.DEBITED=debit;
        this.date_of=date;
    }

    public double getAMOUNT() {
        return AMOUNT;
    }

    public AccountsEntity getDEBITED() {
        return DEBITED;
    }

    public Calendar getDATE() {
        return date_of;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
    
    
    
    public String display(){
        String res;
        res=date_of+" : "+AMOUNT;
        return res;
    } 
    
}
