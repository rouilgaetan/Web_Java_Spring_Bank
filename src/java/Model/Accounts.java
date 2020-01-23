/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Gaetan
 */
public class Accounts {
    private double credits;
    private double account_id;
    private Calendar creation_date;
    private ArrayList<Operations> historique;
    
    Accounts(double credits, double account_id, Calendar creation_date){
        this.credits=credits;
        this.account_id=account_id;
        this.creation_date=creation_date;
        this.historique= new ArrayList<Operations>();
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
    
    public String display(){
        String res;
        res=account_id+" : \n\t"+credits;
        return res;
    }
    
    public String displayHistoric(){
        String res="";
        for(int i=0; i<historique.size(); i++){
            res+=historique.get(i).display();
        }
        return res;
    }
}
