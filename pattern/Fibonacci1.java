class Fibonacci1{
	int n1=0;
	int n2=1;
	int n3=0;
	 public static void Fibonacci1(int count){
		if (count>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			Fibonacci1 (count-1);
			
		}
	}// with recursion
	public static void main(String[] args){
		int count=10;
		System.out.println(count-1);
		Fibonacci1(2);
	}
}