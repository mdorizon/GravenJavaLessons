package fr.wakusay.programme;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		
		//Player (les objects)
		/**
		Player player1 = new Player("Wakusay", 20.0, 300.0);
		System.out.println(player1.getName()+" a " + player1.getHealth()+" points de vie");
		
		Player player2 = new Player("Flawoole", 30.0, 150.0);
		System.out.println(player2.getName()+" a " + player2.getHealth()+" points de vie");
		
		*/
		
		// boucle do while
		
		/**
		int i = 0;
		
		do {
			System.out.println("un tour avant execution du while");
		} while(i != 1); {
			i++;
		}
		*/
		
		// boucle while
		/**
		int i = 0;
		
		while(i != 7) {
			i++;
			System.out.println(i);
		}
		*/
		
		// boucle foreach
		
		/**
		String pseudoss = "Wakusay,Elyo,Flawoole,Scriwhite,Test";
		String[] pseudos = pseudoss.split(",");
		int[] notes = {7, 8, 12, 2};
		int calcul = 0;
		
		for(int note : notes) {
			calcul += note;
		}
		System.out.println("la moyenne est de " + (calcul / notes.length));
		
		for(String str : pseudos) {
			System.out.println(str);
		}
		*/
		
		// boucle for
		
		/**
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		*/
		
		
		// les tableaux
		
			//exemple chaine de caractère --> tableaux
		/**
		String pseudoss = "Wakusay,Elyo,Flawoole,Scriwhite,Test";
		String[] pseudos = pseudoss.split(",");
		System.out.println(pseudos.length);
		System.out.println(pseudos[0]);
		*/
		
			//exemple tableaux dans des tableaux
		/**
		int[][] numbers = {
				{
					5, 7, 8
				},
				{
					3, 2, 1
				},
				{
					9, 4, 2
				}
		};
		System.out.println(numbers[0][1]);
		*/
		
			//exemple avec des ints
		/**
		int[] numbers = { 12, 7, 19 };
		int calcul = ( numbers[0] + numbers[1] + numbers[2] ) / numbers.length;
		System.out.println(calcul);
		*/
		
			//exemple avec des strings
		/**
		String pseudos = "Wakusay";
		String[] names = { "Igor", "IGOr", "Fabien" };
		
		if(names[0].equalsIgnoreCase(names[1])){
			System.out.println("meme chose");
		} else {
			System.out.println("pas la meme");
		}
		*/
		
		//les conditions
		
			//switch
		/**
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
		
		*/
			//if / else / else if
		/**
		System.out.println("");
	
		int money = 2000;
		
		if(money == 2000) {
			System.out.println("oui");
		} else {
			System.out.println("non");
		}
		
		*/
		
		//utilisation des variables pour une moyenne
		/**
		System.out.println("");
		
		int note1 = 10;
		int note2 = 20;
		int note3 = 4;
		
		int moyenne = (note1 + note2 + note3)/3;
		System.out.println("moyenne des notes " + moyenne);
		
		*/
		//utilisation simple des variables
		/**
		System.out.println("");
		
		String pseudo = "wakusay";
		int age = 17;
		
		System.out.println(pseudo + " à " + age);
		age++;
		pseudo = "waku";
		System.out.println(pseudo + " à maintenant " + age);
		*/
		
		
		// les fonctions
		/**
		int money = 850;
		int pricephone = 800;
		boolean hasphone = false;
		
		sendMessage("Test", 9);
		sendMessage("Wakusay", 17);
		sendMessage("La difference est de : " + getResultat(money, pricephone, hasphone), 9); //test
		*/
		
	}
	
	// les fonctions 
	/**
	private static void sendMessage(String message, int number) {
		System.out.println("ceci " + number + " est un message de test des fonctions : " + message);
	}
	
	private static int getResultat(int money, int pricephone, boolean hasphone) {
		if(money >= pricephone && !hasphone) {
			System.out.println("tu peut acheter ce telephone");
		} else {
			System.out.println("tu n'a pas assez d'argent pour acheter ce telephone et en plus tu as deja un telephone");
		}
		
		return money - pricephone;
	}
	*/

}
