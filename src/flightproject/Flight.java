/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightproject;

import java.util.Random;
/**
 *
 * @author HP
 */
public class Flight {
    
    int numOfTickets;
    private Ticket tickets[];
    int index = 0;

    public Flight(int numOfTickets) {
        this.numOfTickets = numOfTickets;
        tickets = new Ticket [numOfTickets];
    }

    void addTicket(Ticket ticket)
    {
        try
        {
            tickets[index] = ticket;
            index++;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Can't add more tickets");
        }
    }
    
    String bookTicket()
    {
        Random rand = new Random();
        boolean notBooked = false;
        
        for(int i = 0 ; i < tickets.length ; ++i)
        {
            if(tickets[i].isBooked() == false)
            {
                notBooked = true;
                break;
            }
        }
        
        String id = "";
        if(notBooked)
        {
            while(true)
            {
                int i = rand.nextInt(tickets.length);
                if(tickets[i].isBooked() == false)
                {
                    tickets[i].setBooked(true);
                    id =  tickets[i].getTicketID();
                }
            }
        }
        return id;
    }
    
    public void returnTicket(String ID)
    {
        boolean found = false;
        for(int i = 0 ; i < tickets.length ; ++i)
        {
            if(tickets[i].getTicketID() == ID  && tickets[i].isBooked() == true)
            {
                tickets[i].setBooked(false);
                found = true;
            }
        }
        if(!found)
        {
            try
            {
                throw new InvalidTicket("Invalid Ticket");
            }
            catch(InvalidTicket e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void resetTicket()
    {
        for (int i = 0;  i < tickets.length ; i++) {
            
            tickets[i].setBooked(false);
        }
            
    }
    
    public Ticket [] getTickets()
    {
        return tickets;
    }
}
          
    
    
