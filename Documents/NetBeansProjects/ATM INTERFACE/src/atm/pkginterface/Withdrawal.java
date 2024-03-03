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
public class Withdrawal {
    
    private Double withdrawalAmnt;

    public Withdrawal(Double withdrawalAmnt) {
        this.withdrawalAmnt = withdrawalAmnt;
    }

    public Double getWithdrawalAmnt() {
        return withdrawalAmnt;
    }
    
    
    
}
