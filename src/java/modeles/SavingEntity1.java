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
public class SavingEntity1 extends AccountsEntity{
    private float interest_rate;
    SavingEntity1(double credits, double account_id, Calendar creation_date, float interest_rate){
        super(credits, account_id, creation_date);
        this.interest_rate=interest_rate;
    }
        
}
