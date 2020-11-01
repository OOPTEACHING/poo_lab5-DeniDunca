package complex;

public class Main {
	public static void main(String[] args) {
		Complex val = new Complex(2, 1);
		Complex val1 = new Complex(1, 3);
		Complex val2 = new Complex(4, 2);
		Complex val3 = new Complex(2, 3);

		Matrice matrice = new Matrice(2, 2, new Complex[] { val, val1, val2, val3 });

		Matrice rezultatAdunare = matrice.adunareMatrici(matrice);
		rezultatAdunare.afisare();

		Matrice rezultatScadere = matrice.scadereMatrici(matrice);
		rezultatScadere.afisare();

		Matrice rezultatInmultire = matrice.inmultireMatrici(matrice);
		rezultatInmultire.afisare();

		Matrice rezultatInmultireScalar = matrice.inmultireCuScalarMatrici(matrice);
		rezultatInmultireScalar.afisare();
	}

}
