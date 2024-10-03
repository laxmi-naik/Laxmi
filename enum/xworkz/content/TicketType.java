package com.xworkz.content;

public enum TicketType {
	ONLINE(180),OFFLINE(130);
	private int cost;
	private TicketType(int cost) {
		this.cost=cost;
	}
}
