package sah;

public class Pion extends Piesa {

	public Pion(boolean alb) {
		super(alb);
	}

	@Override
	public boolean mutareValida(TablaSah tabla, int fromX, int fromY, int toX, int toY) {
		if (super.mutareValida(tabla, fromX, fromY, toX, toY) == false)
			return false;
		if (Math.sqrt(Math.pow(Math.abs((toX - fromX)), 2)) + Math.pow(Math.abs((toY - fromY)), 2) != Math.sqrt(2)) {
			return false;
		}
		return false;
	}
}
