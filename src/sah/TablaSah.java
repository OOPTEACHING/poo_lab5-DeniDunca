package sah;

public class TablaSah {

	private Patratel[][] matrice;

	public TablaSah() {
		this.reset();
	}

	public Patratel getMatrice(int x, int y) {
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			System.out.println("este in afara tablei");
		}
		return matrice[x][y];
	}

	public void reset() {
		matrice[0][0] = new Patratel(0, 0, new Tura(true));
		matrice[0][1] = new Patratel(0, 1, new Cal(true));
		matrice[0][2] = new Patratel(0, 2, new Nebun(true));
		matrice[0][3] = new Patratel(0, 3, new Regina(true));
		matrice[0][4] = new Patratel(0, 4, new Rege(true));
		matrice[0][5] = new Patratel(0, 5, new Nebun(true));
		matrice[0][6] = new Patratel(0, 6, new Cal(true));
		matrice[0][7] = new Patratel(0, 7, new Tura(true));

		matrice[1][0] = new Patratel(1, 0, new Pion(true));
		matrice[1][1] = new Patratel(1, 1, new Pion(true));
		matrice[1][2] = new Patratel(1, 2, new Pion(true));
		matrice[1][3] = new Patratel(1, 3, new Pion(true));
		matrice[1][4] = new Patratel(1, 4, new Pion(true));
		matrice[1][5] = new Patratel(1, 5, new Pion(true));
		matrice[1][6] = new Patratel(1, 6, new Pion(true));
		matrice[1][7] = new Patratel(1, 7, new Pion(true));

		matrice[7][0] = new Patratel(7, 0, new Tura(false));
		matrice[7][1] = new Patratel(7, 1, new Cal(false));
		matrice[7][2] = new Patratel(7, 2, new Nebun(false));
		matrice[7][3] = new Patratel(7, 3, new Regina(false));
		matrice[7][4] = new Patratel(7, 4, new Rege(false));
		matrice[7][5] = new Patratel(7, 5, new Nebun(false));
		matrice[7][6] = new Patratel(7, 6, new Cal(false));
		matrice[7][7] = new Patratel(7, 7, new Tura(false));

		matrice[6][0] = new Patratel(6, 0, new Pion(false));
		matrice[6][1] = new Patratel(6, 1, new Pion(false));
		matrice[6][2] = new Patratel(6, 2, new Pion(false));
		matrice[6][3] = new Patratel(6, 3, new Pion(false));
		matrice[6][4] = new Patratel(6, 4, new Pion(false));
		matrice[6][5] = new Patratel(6, 5, new Pion(false));
		matrice[6][6] = new Patratel(6, 6, new Pion(false));
		matrice[6][7] = new Patratel(6, 7, new Pion(false));

		for (int i = 2; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				matrice[i][j] = new Patratel(i, j, null);
			}
		}
	}
}
