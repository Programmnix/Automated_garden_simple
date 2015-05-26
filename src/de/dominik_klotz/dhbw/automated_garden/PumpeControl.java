package de.dominik_klotz.dhbw.automated_garden;

import com.tinkerforge.BrickletIndustrialQuadRelay;
import com.tinkerforge.IPConnection;

public class PumpeControl {	
	
	private BrickletIndustrialQuadRelay quadRelay;

	public PumpeControl(BrickletIndustrialQuadRelay quadRelay) {
		this.quadRelay = quadRelay;
	}
	
	

}
