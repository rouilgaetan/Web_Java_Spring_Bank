/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gaetan
 */
public class Operations {
    private double amount;
    private Accounts debit;
    
    Operations(double amount, Accounts debit){
        this.amount=amount;
        this.debit=debit;
    }
}
