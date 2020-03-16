/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;

/**
 *
 * @author Gaetan
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="usertype",discriminatorType
=DiscriminatorType.STRING)
@DiscriminatorValue("User")
public class UserEntity implements Serializable {

    @Id
    private String login;
    
    @Column
    private String mdp;
    
    @JoinColumn
    private ArrayList<AccountsEntity> accounts;
    
    public UserEntity(){
        this.login="User";
        this.mdp = "Password";
    }
    
    public UserEntity(String login, String mdp){
        this.login= login;
        this.mdp=mdp;
        this.accounts=new ArrayList<>();
    }
    
    public void addAccount(AccountsEntity compte){
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
    
    public ArrayList<AccountsEntity> getAccounts() {
        return accounts;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login!=null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserEntity)) {
            return false;
        }
        UserEntity other = (UserEntity) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User :"+login;
    }
    
}
