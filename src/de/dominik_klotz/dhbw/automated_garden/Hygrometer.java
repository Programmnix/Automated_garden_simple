package de.dominik_klotz.dhbw.automated_garden;


import com.tinkerforge.BrickletMoisture;
import com.tinkerforge.BrickletMoisture.MoistureListener;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;

public class Hygrometer implements MoistureListener {

	private static final int MOISTURE_VALUE = 500;
	private int lastValue = 0;
	private BrickletMoisture moisture;
	private HygrometerActionInterface hygrometerAction = null;

	public Hygrometer(BrickletMoisture moisture) {
		this.moisture = moisture;
		try
		{
			this.moisture.setMoistureCallbackPeriod(5000);
		} catch (TimeoutException | NotConnectedException e)
		{
			e.printStackTrace();
		}
		this.moisture.addMoistureListener(this);
	}

	@Override
	public void moisture(int moisture) {
		if (hygrometerAction == null || (moisture < MOISTURE_VALUE && lastValue < MOISTURE_VALUE)
				|| (moisture >= MOISTURE_VALUE && lastValue >= MOISTURE_VALUE))
		{
			lastValue = moisture;
			return;
		}
		try
		{
			if (moisture < MOISTURE_VALUE)
			{
				hygrometerAction.underValue();
				lastValue = moisture;
				return;
			}
			hygrometerAction.overValue();
			lastValue = moisture;

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void setHygrometerAction(HygrometerActionInterface hygrometerAction) {
		this.hygrometerAction = hygrometerAction;

	}

}
