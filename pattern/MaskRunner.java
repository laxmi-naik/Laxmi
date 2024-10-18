class MaskRunner
{
        public static void main(String[] args)
        {
                System.out.println("Starting main in MaskRunner");
				
                Mask mask=new Mask();
				
                Mask mask1=new Mask(250);
                System.out.println("cost of mask:"+mask1.cost);

                Mask mask2=new Mask('M');
                System.out.println("size of mask:"+mask2.size);

                Mask mask3=new Mask("Nylon");
                System.out.println("material of mask:"+mask3.material);

                Mask mask4=new Mask(300,'L',"Polyster");
                System.out.println("cost of mask:"+mask4.cost);
                System.out.println("size of mask:"+mask4.size);
                System.out.println("String of mask:"+mask4.material);

                Mask mask5=new Mask(200,'S');
                System.out.println("cost of mask:"+mask5.cost);
                System.out.println("size of mask:"+mask5.size);
				
				Mask mask6=new Mask(200,"cotton");
				System.out.println("cost of mask:"+mask6.cost);
                System.out.println("material of mask:"+mask6.material);

				Mask mask7=new Mask('s',"nylon");
				System.out.println("cost of mask:"+mask7.size);
                System.out.println("material of mask:"+mask7.material);

               

                System.out.println("======================");

     

                Kerosene kerosene=new Kerosene();
				
				Kerosene kerosene1=new Kerosene(4);		
			    System.out.println(" quantity:"+kerosene1.quantity);

				Kerosene kerosene2=new Kerosene(600);
				System.out.println(" price:"+kerosene2.price);
				
				Kerosene kerosene3=new Kerosene(6,720);
                System.out.println(" price:"+kerosene3.price);
                System.out.println(" quantity:"+kerosene3.quantity);
				 
                Kerosene kerosene4=new Kerosene(400,4,true);
                System.out.println(" price:"+kerosene4.price);
                System.out.println(" quantity:"+kerosene4.quantity);
                System.out.println("quality:"+kerosene4.quality);

                Kerosene kerosene5=new Kerosene(false); 
                System.out.println("quality:"+kerosene5.quality);

                Kerosene kerosene6=new Kerosene();
                System.out.println(" price:"+kerosene6.price);
               
				
				
                System.out.println("========================");

               
                Aeroplane aeroplane=new Aeroplane();
				
				Aeroplane aeroplane1=new Aeroplane(5);
				System.out.println("noOfSeats of Aeroplane:"+aeroplane1.noOfSeats);
				
				Aeroplane aeroplane2=new Aeroplane(520);
               
                System.out.println("ticketPrice of Aeroplane:"+aeroplane2.ticketPrice);

		        Aeroplane aeroplane3=new Aeroplane(3,420);
                System.out.println("noOfSeats of Aeroplane:"+aeroplane3.noOfSeats);
                System.out.println("ticketPrice of Aeroplane:"+aeroplane3.ticketPrice);

				
                Aeroplane aeroplane4=new Aeroplane("Airbus",3,1000,"Banglore","Dubai");
                System.out.println("company of Aeroplane:"+aeroplane4.company);
                System.out.println("noOfSeats of Aeroplane:"+aeroplane4.noOfSeats);
                System.out.println("ticketPrice of Aeroplane:"+aeroplane4.ticketPrice);
                System.out.println("source of Aeroplane:"+aeroplane4.source);
                System.out.println("destination of Aeroplane:"+aeroplane4.destination);

                Aeroplane aeroplane5=new Aeroplane("Safran","Mysore","Bankong");
                System.out.println("company of Aeroplane:"+aeroplane5.company);
                System.out.println("source of Aeroplane:"+aeroplane5.source);
                System.out.println("destination of Aeroplane:"+aeroplane5.destination);

                Aeroplane aeroplane6=new Aeroplane("Leonardo",20000,"Delhi","Dubai");
                System.out.println("company of Aeroplane:"+aeroplane6.company);
                System.out.println("ticketPrice of Aeroplane:"+aeroplane6.ticketPrice);
                System.out.println("source of Aeroplane:"+aeroplane6.source);
                System.out.println("destination of Aeroplane:"+aeroplane6.destination);





        }
}