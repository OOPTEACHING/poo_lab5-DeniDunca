package sah;

public class Patratel {
	private Piesa piesa;
	private int x;
	private int y;

	public Patratel(int x, int y, Piesa piesa) {
		this.setPiesa(piesa);
		this.setX(x);
		this.setY(y);
	}

	public Piesa getPiesa() {
		return this.piesa;
	}

	public void setPiesa(Piesa piesa) {
		this.piesa = piesa;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
