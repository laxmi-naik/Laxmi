class Kerosene
{
        double price;
        int quantity;
        boolean quality;

        Kerosene()
        {
                System.out.println("No parameter const");
        }
		Kerosene(double price)
		{
			this.price=price;
		}
		Kerosene(int quantity)
		{
			this.quantity=quantity;
		}
        Kerosene(double price,int quantity,boolean quality)
        {

                System.out.println("double & quantity& quality parameter const");
                this.price=price;
                this.quantity=quantity;
                this.quality=quality;
        }
        Kerosene(boolean quality)
        {
                System.out.println("quality parameter const");
                this.quality=quality;
        }
        Kerosene(int quantity,double price)
        {
                System.out.println("double parameter const");
                this.quantity=quantity;
				this.price=price;
        }

}