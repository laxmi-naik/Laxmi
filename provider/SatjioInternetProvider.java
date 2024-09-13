package com.xworks.provider;

public class SatjioInternetProvider extends JioInternetProvider {

private double cost;
private String launchDate;
public SatjioInternetProvider(String name, String ceoName,double cost,String launchDate) {
	super(name, ceoName);
	this.cost=cost;
	this.launchDate=launchDate;
	
}
@Override
public String toString() {
	return "SatjioInternetProvider [cost=" + cost + ", launchDate=" + launchDate + ", toString()=" + super.toString()+ "]";
}
@Override
public void service() {
	System.out.println("running service method in SatjioInternetProvider");
}

}
