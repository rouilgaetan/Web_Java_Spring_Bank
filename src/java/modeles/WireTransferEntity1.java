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
public class WireTransferEntity1 extends OperationsEntity{
    private final AccountsEntity TO;
    WireTransferEntity1(double id, double amount, AccountsEntity debit, Calendar date, AccountsEntity receiver){
        super(id, amount, debit, date);
        this.TO=receiver;
    }
    
    public void transfer(){
        this.getDebited().setCredits(this.getDebited().getCredits()-this.getAmount());
        this.TO.setCredits(this.TO.getCredits()+this.getAmount());
    }
}
