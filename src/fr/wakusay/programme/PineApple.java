package fr.wakusay.programme;

public class PineApple extends Fruit {

	public PineApple() {
		super("ananas");
	}

	@Override
	public void taste() {
		System.out.println("L'ananas a un gout un peu acide");
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean hasSeed() {
		// TODO Auto-generated method stub
		return false;
	}

}
