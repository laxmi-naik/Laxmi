class recursion{
	public static void main(String[] args){
		int result=sum(4);
		System.out.println(result);
	}
	public static int sum(int k){// 4+sum3,3(4+sum3),2(3(4+sum3)),1(2(3(4+sum(1-1)))
		if(k>0){
			return k+sum(k-1);
		}
		else{
			return  0;
		}
	}
}