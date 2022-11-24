package fr.wakusay.programme;

public class Apple extends Fruit implements PeelFruit {

	public Apple() {
		super("pomme");
	}

	@Override
	public void taste() {
		System.out.println("La pomme à un gout plutôt sucré");
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

	@Override
	public boolean isPeeled() {
		return false;
	}

	@Override
	public String getSkinType() {
		return "lisse";
	}

}
