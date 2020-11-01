package muzica;

public class Musician {
	private String name;
	private Instrument instrument;
	private Band band;

	public Musician(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;

	}

	public Instrument getInstrument() {
		return this.instrument;
	}

	public Band getBand() {
		return this.band;
	}

	public void setBand(Band band) {
		this.band = band;
	}

}
