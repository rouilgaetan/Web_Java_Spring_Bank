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
public class Accounts {
    private double credits;
    private double account_id;
    
    Accounts(double credits, double account_id){
        this.credits=credits;
        this.account_id=account_id;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getAccount_id() {
        return account_id;
    }

    public void setAccount_id(double account_id) {
        this.account_id = account_id;
    }
    
    
}
