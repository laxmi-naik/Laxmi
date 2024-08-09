class Paper{
	double thickness;
	  String size;
	 String quality;
	  String color="white";
	   public  void display(){
		System.out.println(" thickness:"+ this.thickness);
		System.out.println(" size:"+ this.size);
		System.out.println("quality:"+ this.quality);
		System.out.println("color:"+ this.color);
		
	}
	public Paper(String size){
		this.size=size;
	}
	public void setQuality(String quality){
		this.quality=quality;
	}
}
