package com.xworks.provider;

public abstract class Provider {
 private String name;
 private String ceoName;
public Provider(String name, String ceoName) {
	super();
	this.name=name;
	this.ceoName = ceoName;
}

 @Override
public String toString() {
	return "Provider [name=" + name + ", ceoName=" + ceoName + "]";
}

@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Provider ) {
				Provider provider=(Provider)obj;
				if(this.name.equals(provider.name)&&this.ceoName.equals(provider.ceoName)) {
					return true;
				}
				else {
					System.out.println("instance is not matching");
				}
				
			}
			else {
				System.out.println("obj is null");
			}
		}
		return super.equals(obj);
	}
public abstract void service();


}
