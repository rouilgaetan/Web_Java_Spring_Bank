/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Gaetan
 */
public class Counselor extends User{
    
    private ArrayList<User> clients;
    
    Counselor(String login, String mdp){
        super(login, mdp);
        this.clients=new ArrayList<>();
    }
    
    public void createParticular(String login, String mdp, String first_name,String last_name, String address, Calendar birth){
        Particular particulier = new Particular(login, mdp, first_name, last_name, address, birth);
        
    }
    
    public void createProfessional(String login, String mdp, String referent_name, double siret, String name, String address){
        Professional professionnel = new Professional(login, mdp, referent_name, siret, name, address);
    }
    
    public void createCurrent(User u, double credits, double account_id, Calendar creation_date){
        Current courant = new Current(credits, account_id, creation_date);
        u.addAccount(courant);
    }
    
    public void createSaving(User u, double credits, double account_id, Calendar creation_date, float interest_rate){
        Saving epargne = new Saving(credits, account_id, creation_date, interest_rate);
        u.addAccount(epargne);
    }
    
    public String getUsersAccounts(){
        String res="";
        for(int i=0; i<clients.size(); i++){
            res+=clients.get(i).displayAccounts();
        }
        return res;
    }

    public ArrayList<User> getClients() {
        return clients;
    }

    public void setClients(ArrayList<User> clients) {
        this.clients = clients;
    }
    
    
}
