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
public class Ticket {
    protected String ticketID;
    protected float price;
    protected boolean booked;
    protected static int counter = 0;

    public Ticket(String ticketID, float price, boolean booked) {
        this.ticketID = ticketID;
        this.price = price;
        this.booked = booked;
    }
    
    public void display()
    {
        System.out.println("TicketID is : " + ticketID + "/nTicket price is : " + price);
    }

    public String getTicketID() {
        return ticketID;
    }

    public float getPrice() {
        return price;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public void setPrice(float price) { 
        this.price = price;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
    
    
    
}
