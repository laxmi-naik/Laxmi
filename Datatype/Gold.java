class Gold{
	int carat;
	double cost;
	String type;
	Gold(int caratLocal, double costLocal,String typeLocal){
		carat=caratLocal;
		cost=costLocal;
		type=typeLocal;
		System.out.println("gold carat:" +carat);
		System.out.println("gold cost:"+cost);
		System.out.println("gold type:"+type);
	}
}