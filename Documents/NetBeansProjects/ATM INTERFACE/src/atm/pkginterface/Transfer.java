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
public class Transfer {
    
    private Double  transferedAmnt;
    private String receipientID;

    public Transfer(Double transferedAmnt, String receipientID) {
        this.transferedAmnt = transferedAmnt;
        this.receipientID =receipientID ;
    }
    

    public Double getTransferedAmnt() {
        return transferedAmnt;
    }

    public void setTransferedAmnt(Double transferedAmnt) {
        this.transferedAmnt = transferedAmnt;
    }
    
    
}
