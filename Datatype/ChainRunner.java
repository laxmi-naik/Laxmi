class ChainRunner{
	public static void main(String[] args){
		System.out.println("running main in chainRunner");
		byte Carat= Chain.carat();
		System.out.println("carat:"+Carat);
		double costPergram=Chain.cost();
		System.out.println("costPergram:"+costPergram);
		String type=Chain.type();
		System.out.println("type:"+type);
		int quantity=Chain.quantity();
		System.out.println("quantity:"+quantity);
		String quality=Chain.quality();
		System.out.println("quality:"+quality);
		double wastage=Chain.wastage();
		System.out.println("wastage:"+wastage);
		int serviceCharge=Chain.serviceCharge();
		System.out.println("serviceCharge:"+serviceCharge);
		double GST=Chain.gst();
		System.out.println("GST:"+GST);
	}
}