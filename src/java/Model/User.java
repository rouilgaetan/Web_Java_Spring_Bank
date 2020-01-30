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
public class User {
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private ArrayList<Accounts> accounts;
    
    User(String login, String mdp, String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
        this.login= login;
        this.mdp=mdp;
        this.accounts=new ArrayList<>();
    }
    
    public void addAccount(Accounts compte){
        this.accounts.add(compte);
    }
    
    public String displayAccounts(){
        String res="";
        for(int i=0; i<accounts.size(); i++){
            res+=accounts.get(i).display();
        }
        return res;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    public ArrayList<Accounts> getAccounts() {
        return accounts;
    }
    
    
}
