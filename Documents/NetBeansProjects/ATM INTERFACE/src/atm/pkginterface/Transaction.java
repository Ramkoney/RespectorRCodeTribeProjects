package atm.pkginterface;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MJ Mokgosana
 */
public class Transaction {
    private List<String> transactions;

    public Transaction() {
        this.transactions= new ArrayList<>();
         
    }
  
    public void addTransaction( String transaction){
        
              transactions.add(transaction);
    
    }
    public List<String> getTransaction() {
        return transactions;
    }

}
