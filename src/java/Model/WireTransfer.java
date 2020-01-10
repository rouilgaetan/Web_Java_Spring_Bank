/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;

/**
 *
 * @author Gaetan
 */
public class WireTransfer extends Operations{
    private final Accounts TO;
    WireTransfer(double amount, Accounts debit, Calendar date, Accounts receiver){
        super(amount, debit, date);
        this.TO=receiver;
    }
}
