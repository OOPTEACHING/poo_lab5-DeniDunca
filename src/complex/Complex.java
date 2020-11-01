package complex;

public class Complex {
	private int real;
	private int imaginar;

	public Complex(int real, int imaginar) {
		this.real = real;
		this.imaginar = imaginar;
	}

	public int getReal() {
		return this.real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginar() {
		return this.imaginar;
	}

	public void setImaginar(int imaginar) {
		this.imaginar = imaginar;
	}

	public Complex adunare(Complex numar2)// adunam doua numere complexe
	{
		return new Complex(this.real + numar2.real, this.imaginar + numar2.imaginar);

	}

	public Complex scadere(Complex numar2)// scadem doua numere complexe
	{
		return new Complex(this.real - numar2.real, this.imaginar - numar2.imaginar);

	}

	public Complex inmultire(Complex numar2)// inmultim doua numere complexe
	{
		int parteReala = this.real * numar2.real - this.imaginar * numar2.imaginar;
		int parteImaginara = this.real * numar2.imaginar + this.imaginar * numar2.real;
		return new Complex(parteReala, parteImaginara);

	}

	public Complex inmultireCuScalar(int scalar) {
		return new Complex(this.real * scalar, this.imaginar * scalar);
	}

}
