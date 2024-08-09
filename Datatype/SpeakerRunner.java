class SpeakerRunner{
	public static void main(String[] args)
	{

     Speaker speaker=new Speaker("voice is clear");
	 speaker.size=25;
	 speaker.setCost(2500);
	 speaker.display();
	 Speaker speaker1=new Speaker("voice is loud");
	 speaker1.size=62;
	 speaker1.setCost(3000);
	 speaker1.display();
	  Speaker speaker2=new Speaker("clear");
	 speaker2.size=32;
	 speaker2.setCost(4000);
	 speaker2.display();
	}
}