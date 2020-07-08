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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="accountstype",discriminatorType
=DiscriminatorType.STRING)
@DiscriminatorValue("Accounts")
public class AccountsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private double account_id;
    
    @Column
    private double credits;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar creation_date;
    
    @OneToMany(mappedBy="debited")
    private List<OperationsEntity> historique;
    
    @ManyToOne
    @JoinColumn(name="user_fk")
    private UserEntity user;
    
    
    public AccountsEntity(){
        
    }
    
    
    public AccountsEntity(double credits, double account_id, Calendar creation_date){
        this.credits=credits;
        this.account_id=account_id;
        this.creation_date=creation_date;
        this.historique= new ArrayList<>();
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
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
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (account_id!=0 ? account_id : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountsEntity)) {
            return false;
        }
        AccountsEntity other = (AccountsEntity) object;
        return this.account_id == other.account_id;
    }

    @Override
    public String toString() {
        return "Account :"+account_id;
    }
    
}
