/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gaetan
 */
public class WireTransfer extends Operations{
    private Accounts receiver;
    WireTransfer(double amount, Accounts debit, Accounts receiver){
        super(amount, debit);
        this.receiver= receiver;
    }
}
