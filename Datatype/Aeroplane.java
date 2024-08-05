class Aeroplane
{
        String company;
        int noOfSeats;
        double ticketPrice;
        String source;
        String destination;


        Aeroplane()
        {
                System.out.println("No parameter const");
        }
		
		
		Aeroplane(int noOfSeats)
		{
			this.noOfSeats=noOfSeats;
		}
		
		
		Aeroplane(double ticketPrice)
		{
			this.ticketPrice=ticketPrice;
		}
		
	    Aeroplane(int noOfSeats,double ticketPrice)
		{
			this.noOfSeats=noOfSeats;
			this.ticketPrice=ticketPrice;
		}
		
		
        Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination)
        {
                this.company=company;
                this.noOfSeats=noOfSeats;
                this.ticketPrice=ticketPrice;
                this.source=source;
                this.destination=destination;
        }

        Aeroplane(String company,String source,String destination)
        {
        this.company=company;
        this.source=source;
        this.destination=destination;
        }
		
        Aeroplane(String company,double ticketPrice,String source,String destination)
        {
                this.company=company;
                this.ticketPrice=ticketPrice;
                this.source=source;
                this.destination=destination;
        }
}