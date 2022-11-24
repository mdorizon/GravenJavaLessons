package fr.wakusay.programme;

import java.util.TimerTask;

public class CustomTimer extends TimerTask {

	private int time = 10;
	
	@Override
	public void run() {
		System.out.println("time : "+ time);
		
		if(time == 5) 
		{
			System.out.println("Attention !");
		}
		if(time == 0) 
		{
			cancel();
		}
		
		time--;
	}

}
