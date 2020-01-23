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
public class Particular extends User {
    private String first_name;
    private String last_name;
    private Calendar birth;
    private String address;
    
    
    
    Particular(String login, String mdp, String first_name,String last_name, String address, Calendar birth){
        super(login, mdp);
        this.first_name=first_name;
        this.last_name=last_name;
        this.birth= birth;
        this.address= address;
    }

    public String getFirst_Name() {
        return first_name;
    }
    
    public String getLast_Name(){
        return last_name;
    }

    public Calendar getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }
    
    
}
