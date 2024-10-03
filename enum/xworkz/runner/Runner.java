package com.xworkz.runner;

import com.xworks.dto.CustomerDTO;
import com.xworks.dto.TicketBookDTO;
import com.xworkz.content.ProductType;
import com.xworkz.content.SeatType;
import com.xworkz.content.TicketType;

public class Runner {

	public static void main(String[] args) {
		CustomerDTO customerDTO=new CustomerDTO("laxmi", "laxmi@gmail.com",ProductType.KITCHEN);
        System.out.println("Customer Name:"+customerDTO.getName());
        System.out.println("Customer Email:"+customerDTO.getEmail());
        System.out.println("Customer Name:"+customerDTO.getProductType());
        System.out.println("++++++++++++++++++++++++++");
        TicketBookDTO ticketBookDTO=new TicketBookDTO("ronny","navarang", TicketType.OFFLINE, SeatType.PREMIUM);
        System.out.println("Movie Name:"+ticketBookDTO.getMovieName());
        System.out.println("Theater Name:"+ticketBookDTO.getTheaterName());
        System.out.println("Ticket Type:"+ticketBookDTO.getTicketType());
        System.out.println("Seat Type:"+ticketBookDTO.getSeatType());
	}

}
