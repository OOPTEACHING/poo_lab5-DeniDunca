package sah;

public abstract class Piesa {

	private boolean alb;

	public Piesa(boolean alb) {
		super();
		this.alb = alb;
	}

	public boolean getAlb() {
		return alb;
	}

	public void setAlb(boolean alb) {
		this.alb = alb;
	}

	public boolean mutareValida(TablaSah tabla, int fromX, int fromY, int toX, int toY) {
		if (toX == fromX && toY == fromY) {
			return false;
		}
		if (toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY < 0 || fromY > 7) {
			return false;
		}

		return true;
	}
}
