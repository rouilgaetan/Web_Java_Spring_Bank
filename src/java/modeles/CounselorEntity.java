/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Gaetan
 */
@Entity
@DiscriminatorValue("Counselor")
public class CounselorEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    private String name;

    @OneToMany(mappedBy="counselor")
    private List<UserEntity> clients;
    
    
    public CounselorEntity(){
        this.name="toto";
        this.clients=new ArrayList<>();
    }
    
    public CounselorEntity(String name){
        this.name= name;
        this.clients=new ArrayList<>();
    }
    
    public void createParticular(String login, String mdp, String first_name,String last_name, String address, Calendar birth){
        ParticularEntity particulier = new ParticularEntity(login, mdp, first_name, last_name, address, birth, this);
        
    }
    
    public void createProfessional(String login, String mdp, String referent_name, double siret, String name, String address){
        ProfessionalEntity professionnel = new ProfessionalEntity(login, mdp, referent_name, siret, name, address, this);
    }
    
    public void createCurrent(UserEntity u, double credits, double account_id, Calendar creation_date){
        CurrentEntity courant = new CurrentEntity(credits, account_id, creation_date);
        u.addAccount(courant);
    }
    
    public void createSaving(UserEntity u, double credits, double account_id, Calendar creation_date, float interest_rate){
        SavingEntity epargne = new SavingEntity(credits, account_id, creation_date, interest_rate);
        u.addAccount(epargne);
    }
    
    public String getUsersAccounts(){
        String res="";
        for(int i=0; i<clients.size(); i++){
            res+=clients.get(i).displayAccounts();
        }
        return res;
    }

    public List<UserEntity> getClients() {
        return clients;
    }

    public void setClients(ArrayList<UserEntity> clients) {
        this.clients = clients;
    }
    
}
