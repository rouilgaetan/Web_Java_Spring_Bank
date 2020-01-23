/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;

/**
 *
 * @author Gaetan
 */
public class Saving extends Accounts{
    private float interest_rate;
    Saving(double credits, double account_id, Calendar creation_date, float interest_rate){
        super(credits, account_id, creation_date);
    }
        
}
