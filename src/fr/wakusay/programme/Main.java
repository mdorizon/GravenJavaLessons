package fr.wakusay.programme;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;

@SuppressWarnings("unused")
public class Main {
	
	public static void main(String[] args) {
		
		
		
		
		//les callbacks
		
		/**
		substract(10, 7, new CalculListener() {
			
			@Override
			public void onPositiveResult() {
				
				System.out.println("c'est bien");
				
			}
			
			@Override
			public void onNegativeResult() {
				
				System.out.println("attention !");
				
			}
		});
		*/
		
		//les fichiers
		
		/**
		File folder = new File("C://Users/mdori/Desktop/dossier1");
		File file = new File("C://Users/mdori/Desktop/dossier1/doc.txt");
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			
			FileWriter writer;
			try {
				writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer);
				bw.write("salut les gens c'est wakusay");
				bw.newLine();
				bw.write("comment ça va ?");
				bw.newLine();
				bw.write("test");
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		*/
		
		//les chronometres
		
		/**
		Timer chrono = new Timer();
		chrono.schedule(new CustomTimer(), 1000, 1000);
		*/
		
		// les exceptions
		
		/**
		int[] numbers = { 4, 7, 9, 1 };
		
		try {
			System.out.println(numbers[4]);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finnaly");
		}
		
		//créer une exception
		
		double balance = 5000;
		double price = 5900;
		
		try {
			buy(balance, price);
		} catch (NoMoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	/**
	private static void buy(double balance, double price) throws NoMoneyException {
		
		double b = balance - price;
		
		if(b < 0)
		{
			throw new NoMoneyException();
		}
		
		System.out.println(b);
	}
	*/
	
	private static void substract(int a, int b, CalculListener listener) {
		
		int result = a - b;
		System.out.println("le resultat de la soustraction est : "+result);
		
		if(result > 0) {
			
			System.out.println("le resultat est positif");
			listener.onPositiveResult();
			
		} else {
			
			System.out.println("le resultat est négatif");
			listener.onNegativeResult();
			
		}
		
	}
			
		// les hashmaps
		
		/**
		Map<String, Integer> ages = new HashMap<>();
		ages.put("Wakusay", 18);
		ages.put("elyo", 16);
		ages.put("bob", 27);
		
		System.out.println(ages.toString());
		
		int moyenne = 0;
		
		for(Entry<String, Integer> element : ages.entrySet())
		{
			moyenne += element.getValue();
			System.out.println("La clef est : "+element.getKey()+" , son age : "+element.getValue());
		}
		
		moyenne /=  ages.size();
		
		System.out.println(moyenne);
		*/
		
		//les arraylists
		
		/**
		ArrayList<String> list = new ArrayList<>();
		list.add("Texte");
		list.add("Pomme");
		
		System.out.println(list);
		
		if(list.contains("Texte")) {
			System.out.println("l'element existe bien");
		}
		
		if(list.size() != 1) {
			System.out.println("le tableau n'est pas egal a 1");
		}
		*/
		
		//les énumérations
		
		/**
		for(Day moment : Day.values()) {
			if(!moment.equals(Day.MIDI)) {
				System.out.println("Nous sommes actuellement le "+moment.name().toLowerCase()+" il est actuellement : "+moment.getHour()+"h , "+moment.getMessage());
			}
		}
		*/
		
		//L'heritage avec les fruits
		
		/**
		Apple a = new Apple();
		a.taste();
		a.miam();
		
		PineApple pen = new PineApple();
		pen.taste();
		pen.miam();
		
			//Les interfaces
		if(a instanceof PeelFruit) {
			PeelFruit fruit = pen;
		}
		*/
		
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

//}
