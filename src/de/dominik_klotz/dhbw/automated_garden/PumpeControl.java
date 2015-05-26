package de.dominik_klotz.dhbw.automated_garden;

import com.tinkerforge.BrickletIndustrialQuadRelay;
import com.tinkerforge.IPConnection;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;

public class PumpeControl {	
	
	private BrickletIndustrialQuadRelay quadRelay;
	private final int RELAY = 0;

	public PumpeControl(BrickletIndustrialQuadRelay quadRelay) {
		this.quadRelay = quadRelay;
	}

	public void start() throws TimeoutException, NotConnectedException{
		quadRelay.setValue(1 << RELAY);
		
	}

	public void stop() throws TimeoutException, NotConnectedException {
		quadRelay.setValue(0 << RELAY);
	}
	
	public boolean isPumpOn() throws TimeoutException, NotConnectedException{
		if((quadRelay.getValue() & (1 << RELAY)) > 0){
			return true;
		}
		return false;
	}

	
	

}
