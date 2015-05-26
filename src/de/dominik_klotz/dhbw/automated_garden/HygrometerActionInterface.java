package de.dominik_klotz.dhbw.automated_garden;

import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;


public interface HygrometerActionInterface {

	public void underValue() throws TimeoutException, NotConnectedException;
	
	public void overValue() throws TimeoutException, NotConnectedException;
}
