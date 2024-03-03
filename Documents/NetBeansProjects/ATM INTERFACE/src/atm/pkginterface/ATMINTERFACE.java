/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.pkginterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MJ Mokgosana
 */
public class ATMINTERFACE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String userId;
        String userPin;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your userID");
        userId =sc.nextLine();
        
        System.out.println("Enter your userPin");
        userPin =sc.next();
        
         UserDetails user =new UserDetails (  userId, userPin);

        Transaction trans = new Transaction();
        List<String> history = new ArrayList<>();
   
         if ( userId.length()==13 && userId.equalsIgnoreCase(user.getUserId()))   
         {
             
             if ( userPin.length() == 6 &&  userPin.equalsIgnoreCase(user.getUserPassword())){
                 
          
             System.out.println(" Login Succesful , You may continue with your services!");
         
             
              System.out.println("Enter option of your choice :"
                      
                      + "\n  1 - Withdraw "
                      + "\n  2 - Deposit "
                      + "\n 3 -  Transer "
                      + "\n 4 - History "
                      + " \n 5 - Quit ");
               int option = sc.nextInt();
             while (option!=5)
        {
        
            switch (option){
            
           
             
                case 1:  System.out.println("Enter amount you want to Withdraw");
                         Double withdrwAmnt =sc.nextDouble();
                         Withdrawal withdraw = new Withdrawal(withdrwAmnt);
                         history.add("Withdrwal Amount: R " +  withdraw.getWithdrawalAmnt());
                         break;
                         
                case 2 :   System.out.println("Enter amount you want to Deposit");
                           Double depositAmount =sc.nextDouble();    
                           Deposit deposit = new Deposit(depositAmount);
                           //deposit.getDepositAmnt();
                           history.add("Deposit Amount  : R " + deposit.getDepositAmnt());
                           break;
                
                case 3:   System.out.println("Enter your recepient ");
                          String recepientID =sc.next();
                          System.out.println("Enter amount you want to Transfer");
                          Double transferAmount =sc.nextDouble();
                          Transfer transfer =new Transfer(transferAmount,recepientID);
                          transfer.getTransferedAmnt();
                          history.add("Traserf : R" + transferAmount + " to : "  + recepientID);
                          break;
                          
                case 4 :    
                        
                          System.out.println("View your Transactions:" );
                          
                          for (String transact : history) {
                          System.out.println(transact);
                          }
                    break;
                          
                default : 
                    
                           Quit quit = new Quit();
        }
        System.out.println("Enter option of your choice :"
                      
                      + "\n 1 - Withdraw "
                      + "\n 2 - Deposit "
                      + "\n 3 - Transfer "
                      + "\n 4 - History "
                      + "\n 5 - Quit ");    
         option = sc.nextInt();
         
             }
            
            System.out.println("Thank you for using our system Bye!!!" );
            }
          else {
             System.out.println("Invalid login ,Enter Valid details");
         }
        
    
    }
    
}
}