package fr.wakusay.programme;

public enum Day {

	MATIN(8,"Il est l'heure de se lever"),
	MIDI(12, "a table"),
	APRESMIDI(15, "bon foot"),
	SOIR(22, "bonne nuit"),
	NUIT(2, "fais de beau reves");
	
	private int hour;
	private String message;
	
	Day(int hour, String message){
		this.hour = hour;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getHour() {
		return hour;
	}
	
}
