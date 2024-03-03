package atm.pkginterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MJ Mokgosana
 */
public class Deposit {
    
    private Double depositAmnt;

    public Deposit(Double depositAmnt) {
        this.depositAmnt = depositAmnt;
    }

    public Double getDepositAmnt() {
        return depositAmnt;
    }

}
