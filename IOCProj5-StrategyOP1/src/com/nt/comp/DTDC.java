package com.nt.comp;

public final class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
		
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		
		return  "DTDC courier will delider order id ::"+oid+" order product" ;
	}

}
