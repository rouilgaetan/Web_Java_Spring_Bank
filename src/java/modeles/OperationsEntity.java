/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Gaetan
 */
public class OperationsEntity implements Serializable {
    private double id;
    private final double AMOUNT;
    private final AccountsEntity FROM;
    private final Calendar DATE;
    
    OperationsEntity(double id, double amount, AccountsEntity debit, Calendar date){
        this.id=id;
        this.AMOUNT=amount;
        this.FROM=debit;
        this.DATE=date;
    }

    public double getAMOUNT() {
        return AMOUNT;
    }

    public AccountsEntity getFROM() {
        return FROM;
    }

    public Calendar getDATE() {
        return DATE;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
    
    
    
    public String display(){
        String res;
        res=DATE+" : "+AMOUNT;
        return res;
    }   
}
