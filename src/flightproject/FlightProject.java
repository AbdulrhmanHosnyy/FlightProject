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
public class FlightProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ticket ticket1 = new Ticket("1" , 500 , true);
        Ticket ticket2 = new Ticket("2" , 600 , true);
        VipTicket ticket3 = new VipTicket("A" , "3" , 700 , true);
        Flight flight = new Flight(3);
        flight.addTicket(ticket1);
        flight.addTicket(ticket2);
        flight.addTicket(ticket3);
        String id = flight.bookTicket();
        flight.returnTicket("A");
        Ticket [] tickets = flight.getTickets();
        
        for (int i = 0; i < tickets.length; i++) {
            if(tickets[i] instanceof VipTicket)
                System.out.println("Vip");
      
        else
        System.out.println("Regular");
          
        }
       
      
    }
    
}
