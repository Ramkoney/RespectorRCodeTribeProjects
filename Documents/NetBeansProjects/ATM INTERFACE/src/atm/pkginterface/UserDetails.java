/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.pkginterface;

/**
 *
 * @author MJ Mokgosana
 */
public class UserDetails {
    private  String userId;
    private String userPassword;

    public UserDetails(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }
    
    

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    
    
}
