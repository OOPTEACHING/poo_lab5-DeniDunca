package complex;

public class Matrice {
	private Complex[][] elemente;
	private int linii;
	private int coloane;

	public Matrice(int linii, int coloane, Complex[] numere) {
		this.linii = linii;
		this.coloane = coloane;
		this.elemente = new Complex[linii][coloane];
		this.elemente[0][0] = numere[0];
		this.elemente[0][1] = numere[1];
		this.elemente[1][0] = numere[2];
		this.elemente[1][1] = numere[3];

	}

	public Matrice(int linii, int coloane) {
		this.linii = linii;
		this.coloane = coloane;
		this.elemente = new Complex[linii][coloane];
	}

	public int getLinii() {
		return this.linii;
	}

	public void setLinii(int linii) {
		this.linii = linii;
	}

	public int getColoane() {
		return this.coloane;
	}

	public void setColoane(int coloane) {
		this.coloane = coloane;
	}

	public Matrice() {

		this(2, 2, new Complex[4]);
	}

	public Matrice adunareMatrici(Matrice matrice2) {
		Matrice sumaMat = new Matrice();
		sumaMat.elemente[0][0] = this.elemente[0][0].adunare(matrice2.elemente[0][0]);
		sumaMat.elemente[0][1] = this.elemente[0][1].adunare(matrice2.elemente[0][1]);
		sumaMat.elemente[1][0] = this.elemente[1][0].adunare(matrice2.elemente[1][0]);
		sumaMat.elemente[1][1] = this.elemente[1][1].adunare(matrice2.elemente[1][1]);

		return sumaMat;
	}

	public Matrice scadereMatrici(Matrice matrice2) {
		Matrice difMat = new Matrice();
		difMat.elemente[0][0] = this.elemente[0][0].scadere(matrice2.elemente[0][0]);
		difMat.elemente[0][1] = this.elemente[0][1].scadere(matrice2.elemente[0][1]);
		difMat.elemente[1][0] = this.elemente[1][0].scadere(matrice2.elemente[1][0]);
		difMat.elemente[1][1] = this.elemente[1][1].scadere(matrice2.elemente[1][1]);

		return difMat;
	}

	public Matrice inmultireMatrici(Matrice matrice2) {
		Matrice inmultireMat = new Matrice(matrice2.getLinii(), matrice2.getColoane());
		inmultireMat.elemente[0][0] = inmultireMat.elemente[0][0]
				.adunare(this.elemente[0][1].inmultire(matrice2.elemente[1][0]));
		inmultireMat.elemente[0][1] = inmultireMat.elemente[0][1]
				.adunare(this.elemente[0][1].inmultire(matrice2.elemente[1][1]));
		inmultireMat.elemente[1][0] = inmultireMat.elemente[0][0]
				.adunare(this.elemente[1][1].inmultire(matrice2.elemente[1][0]));
		inmultireMat.elemente[1][1] = inmultireMat.elemente[0][1]
				.adunare(this.elemente[1][1].inmultire(matrice2.elemente[1][1]));

		return inmultireMat;
	}

	public Matrice inmultireCuScalarMatrici(Matrice matrice2) {
		Matrice inmultireCuScalarMat = new Matrice();
		inmultireCuScalarMat.elemente[0][0] = this.elemente[0][0].inmultireCuScalar(3);
		inmultireCuScalarMat.elemente[0][1] = this.elemente[0][1].inmultireCuScalar(3);
		inmultireCuScalarMat.elemente[1][0] = this.elemente[1][0].inmultireCuScalar(3);
		inmultireCuScalarMat.elemente[1][1] = this.elemente[1][1].inmultireCuScalar(3);

		return inmultireCuScalarMat;
	}

	public void afisare() {
		for (int i = 0; i < this.linii; i++) {
			for (int j = 0; j < this.coloane; j++) {
				System.out.print(this.elemente[i][j].getReal() + " " + this.elemente[i][j].getImaginar() + " ");
			}
			System.out.println(" ");
		}
	}

}
