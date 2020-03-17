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

    private static final long serialVersionUID = 1L;

    @Id
    private double id;
    
    @Column
    private double amount;
    
    @ManyToOne
    @JoinColumn(name="accounts_fk")
    private AccountsEntity debited;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar date_of;
    
    public OperationsEntity(){

    }
    
    
    public OperationsEntity(double id, double amount, AccountsEntity debit, Calendar date){
        this.id=id;
        this.amount=amount;
        this.debited=debit;
        this.date_of=date;
    }

    public double getAmount() {
        return amount;
    }

    public AccountsEntity getDebited() {
        return debited;
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
        res=date_of+" : "+amount;
        return res;
    } 
    
}
