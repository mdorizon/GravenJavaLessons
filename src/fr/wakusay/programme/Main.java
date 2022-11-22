package fr.wakusay.programme;

public class Main {

	public static void main(String[] args) {
		
		
		//les conditions
		System.out.println("");
		
		//switch
		System.out.println("");
		
		int age2 = 11;
		
		switch(age2){
			case 10:
				System.out.println("10 ans");
			break;
			
			case 11:
				System.out.println("11 ans");
			break;
			
			default: System.out.println("Cet age n'as pas de message");
		}
		
		
		//if / else / else if
		System.out.println("");
	
		int money = 2000;
		
		if(money == 2000) {
			System.out.println("oui");
		} else {
			System.out.println("non");
		}
		
		 
		//utilisation des variables pour une moyenne
		System.out.println("");
		
		int note1 = 10;
		int note2 = 20;
		int note3 = 4;
		
		int moyenne = (note1 + note2 + note3)/3;
		System.out.println("moyenne des notes " + moyenne);
		
		
		//utilisation simple des variables
		System.out.println("");
		
		String pseudo = "wakusay";
		int age = 17;
		
		System.out.println(pseudo + " à " + age);
		age++;
		pseudo = "waku";
		System.out.println(pseudo + " à maintenant " + age);
	}

}
