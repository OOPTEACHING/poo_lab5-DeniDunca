package sah;

public class Tura extends Piesa {
	public Tura(boolean alb) {
		super(alb);
	}

	@Override
	public boolean mutareValida(TablaSah tabla, int fromX, int fromY, int toX, int toY) {
		if (super.mutareValida(tabla, fromX, fromY, toX, toY) == false) {
			return false;
		}
		if (toX == fromX) {
			return true;
		}
		if (toY == fromY) {
			return true;
		}
		return false;
	}

}
