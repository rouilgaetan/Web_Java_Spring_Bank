/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author Gaetan
 */
@Entity
@DiscriminatorValue("Particular")
public class ParticularEntity extends UserEntity {
    
    @Column
    private String first_name;
    
    @Column
    private String last_name;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar birth;
    
    @Column
    private String address;
    
    public ParticularEntity(){
        super();
    }
    
    public ParticularEntity(String login, String mdp, String first_name,String last_name, String address, Calendar birth){
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
