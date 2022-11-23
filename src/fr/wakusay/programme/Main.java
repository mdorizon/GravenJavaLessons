package fr.wakusay.programme;

public class Main {

	public static void main(String[] args) {
		
		
		
		
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
	}

}
