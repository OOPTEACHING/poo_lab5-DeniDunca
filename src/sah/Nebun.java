package sah;

public class Nebun extends Piesa {
	public Nebun(boolean alb) {
		super(alb);
	}

	@Override
	public boolean mutareValida(TablaSah tabla, int fromX, int fromY, int toX, int toY) {
		if (super.mutareValida(tabla, fromX, fromY, toX, toY) == false) {
			return false;
		}
		if (toX - fromX == toY - fromY) {
			return true;
		}
		return false;
	}
}
