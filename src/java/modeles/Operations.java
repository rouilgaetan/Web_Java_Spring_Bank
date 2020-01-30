/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.Calendar;

/**
 *
 * @author Gaetan
 */
public class Operations {
    private final double AMOUNT;
    private final Accounts FROM;
    private final Calendar DATE;
    
    Operations(double amount, Accounts debit, Calendar date){
        this.AMOUNT=amount;
        this.FROM=debit;
        this.DATE=date;
    }

    public double getAMOUNT() {
        return AMOUNT;
    }

    public Accounts getFROM() {
        return FROM;
    }

    public Calendar getDATE() {
        return DATE;
    }
    
    public String display(){
        String res;
        res=DATE+" : "+AMOUNT;
        return res;
    }   
}
