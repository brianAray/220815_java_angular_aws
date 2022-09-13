package com.revature.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	
	private Instrument instrument;

	@Autowired
	public Performer(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Performer [instrument=" + instrument + "]";
	}
	
	

}
