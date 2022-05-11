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
public class VipTicket extends Ticket {
    
    private String type;

    public VipTicket(String type, String ticketID, float price, boolean booked) {
        super(ticketID, price, booked);
        this.type = type;
    }
    
     public void display()
    {
        System.out.println("TicketID is : " + ticketID + "/nTicket price is : " + price +
        "/nTicket Type : " + type);
    }
    
    
}
