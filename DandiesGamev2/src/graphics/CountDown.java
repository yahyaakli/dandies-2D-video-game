package graphics;

import java.util.Timer;
import java.util.TimerTask;

public class CountDown {
	
	private int timecounter;
	private Timer time;
	public CountDown() {
		this.timecounter = 61;
		 
	}
	
	
	public int gettimecounter() {
		return timecounter;
	} 


	public void tick() {
		time = new Timer();
		time.schedule(new TimerTask() {
			public void run() {
				timecounter--;
			}
		}, 1000, 1000);
			
	}
	

}