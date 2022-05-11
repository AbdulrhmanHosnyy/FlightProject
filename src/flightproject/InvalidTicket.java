/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightproject;

/**
 *
 * @author HP
 */
public class InvalidTicket extends Exception {

    public InvalidTicket(String msg) {
        super(msg);
    }
   
    public String getMessage()
    {
        return super.getMessage();
    }
    

}
