package com.nt.component;

public final class DTDC implements Courior {

    public DTDC() {
	System.out.println("DTDC::0-param Constructor");
    }
    public String deliver(int oid) {
	// TODO Auto-generated method stub
	return "Delivering "+oid+" Order id order product using DTDC";
    }

}
