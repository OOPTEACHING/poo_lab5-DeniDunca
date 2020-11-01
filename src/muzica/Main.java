package muzica;

public class Main {

	public static void main(String[] args) {
		Musician musician = new Musician("Bongo Cat");
		musician.setInstrument(Instrument.DRUMS);

		Instrument[] instruments = new Instrument[] { Instrument.BASS, Instrument.DRUMS, Instrument.GUITAR };

		Band band = new Band(3, "Band", instruments);

		band.addMusician(musician);

		band.printMusician();

		band.deleteMusician(musician);

	}
}
