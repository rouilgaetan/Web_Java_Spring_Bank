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
public class Client extends User {
    private String name;
    private Calendar birth;
    private String address;
    
    private ArrayList<Accounts> accounts;
    
    Client(String login, String mdp, String name, String address, Calendar birth){
        super(login, mdp);
        this.accounts=new ArrayList<>();
        this.name=name;
        this.birth= birth;
        this.address= address;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Accounts> getAccounts() {
        return accounts;
    }
    
    
}
