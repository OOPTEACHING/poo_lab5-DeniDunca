package sah;

public class Cal extends Piesa {
	public Cal(boolean alb) {
		super(alb);
	}

	@Override
	public boolean mutareValida(TablaSah tabla, int fromX, int fromY, int toX, int toY) {
		if (super.mutareValida(tabla, fromX, fromY, toX, toY) == false) {
			return false;
		}
		if (toX != fromX - 1 && toX != fromX + 1 && toX != fromX + 2 && toX != fromX - 2) {
			return false;
		}
		if (toY != fromY - 2 && toY != fromY + 2 && toY != fromY - 1 && toY != fromY + 1) {
			return false;
		}

		return true;
	}

}
