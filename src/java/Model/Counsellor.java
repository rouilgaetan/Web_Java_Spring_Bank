/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Gaetan
 */
public class Counsellor extends User{
    
    private ArrayList<User> clients;
    Counsellor(String login, String mdp){
        super(login, mdp);
        this.clients=new ArrayList<>();
    }
    
    
    
    
}
