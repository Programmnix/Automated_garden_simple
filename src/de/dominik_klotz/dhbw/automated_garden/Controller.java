package de.dominik_klotz.dhbw.automated_garden;

import java.io.IOException;
import java.net.UnknownHostException;

import com.tinkerforge.AlreadyConnectedException;
import com.tinkerforge.BrickletIndustrialQuadRelay;
import com.tinkerforge.BrickletMoisture;
import com.tinkerforge.BrickletMoisture.MoistureCallbackThreshold;
import com.tinkerforge.IPConnection;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;


public class Controller implements HygrometerActionInterface{

	public static String QUAD_RELAY_UID = "roN";
	public static String MOISTURE_UID = "s1S";
	
	Hygrometer hygrometer;
	PumpeControl pumpeControl;
	
	
	public Controller() throws UnknownHostException, AlreadyConnectedException, IOException {
		IPConnection ipConn = new IPConnection();
		
		ipConn.connect("192.168.1.153", 4223);
		
		BrickletIndustrialQuadRelay quadRelay = new BrickletIndustrialQuadRelay(QUAD_RELAY_UID, ipConn);
		BrickletMoisture moisture = new BrickletMoisture(MOISTURE_UID, ipConn);
		
		
		pumpeControl = new PumpeControl(quadRelay);
		
		hygrometer = new Hygrometer(moisture);
		hygrometer.setHygrometerAction(this);
	}
	
	public static void start(){
		try
		{
			Controller controller = new Controller();
			while (true)
			{
				try
				{
					Thread.sleep(50);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}
		} catch (UnknownHostException e)
		{
			e.printStackTrace();
			System.exit(1);
		} catch (AlreadyConnectedException e)
		{
			
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e)
		{
			e.printStackTrace();
		
			System.exit(1);
		}
	}

	@Override
	public void underValue() throws TimeoutException, NotConnectedException {
		System.out.println("Under hygrovalue");
		pumpeControl.start();
		System.out.println("Pump started");
		
	}

	@Override
	public void overValue() throws TimeoutException, NotConnectedException {
		System.out.println("Under hygrovalue");
		pumpeControl.stop();
		System.out.println("Pump stoped");
	}

}
