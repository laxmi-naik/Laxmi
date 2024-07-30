class Stars{

public static void main(String[] args){

int n=10;

for(int i=0;i<n-1;i++){//i=0,1 10<10
for(int j=i;j<n;j++){//i=1  j=0,1  decrement
		System.out.print("  ");
	}
    for(int j=0;j<i;j++){//i=1  j=0,1
		System.out.print(" *");
	}
	 for(int j=0;j<=i;j++){//i=1  j=0,1
		System.out.print(" *");
	}
	
	System.out.println();
	
	
}
for(int i=0;i<n;i++){//i=0,1 10<10
    for(int j=0;j<=i;j++){//i=1  j=0,1
		System.out.print("  ");
	}
	for(int j=i;j<n-1;j++){//i=1  j=0,1
		System.out.print(" *");
	}
	 for(int j=i;j<n;j++){//i=1  j=0,1
		System.out.print(" *");
	}
	
	System.out.println();
	
	
}


}
}