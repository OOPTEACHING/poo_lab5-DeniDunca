package muzica;

public class Band {
	private int index = 0;
	private int numberOfMembers;
	private String name;
	private Instrument[] instruments;
	private Musician[] musicians;

	public Band(int numberOfMembers, String name, Instrument[] instruments) {
		this.numberOfMembers = numberOfMembers;
		this.name = name;
		this.musicians = new Musician[numberOfMembers];
		this.instruments = instruments;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	public int getNumberOfMembers() {
		return this.numberOfMembers;
	}

	public void setNameBand(String name) {
		this.name = name;
	}

	public String getNameBand() {
		return this.name;
	}

	public void addMusician(Musician musician) {
		for (int i = 0; i < instruments.length; i++) {
			if (instruments[i].getName().equals(musician.getInstrument().getName())) {
				musicians[index++] = musician;
				System.out.println("Muzicianul a fost adaugat in band");
			}
		}
	}

	public void printMusician() {
		for (int i = 0; i < musicians.length; i++) {
			if (musicians[i] != null) {
				System.out.println(musicians[i].getName());
			}
		}
	}

	public boolean checkIfAvailable(Instrument instrument) {
		for (int i = 0; i < index; i++) {
			if (instrument == musicians[i].getInstrument()) {
				return false;
			}
		}
		return true;
	}

	public Instrument[] getMissingInstruments() {

		int indexLipsa = 0;
		Instrument[] lipseste = new Instrument[numberOfMembers];
		for (int i = 0; i < instruments.length; i++) {
			if (checkIfAvailable(instruments[i])) {
				lipseste[indexLipsa] = instruments[i];
				indexLipsa++;
			}
		}
		return lipseste;
	}

	public void deleteMusician(Musician musician) {
		int i;
		boolean gasit = false;
		for (i = 0; i < index; i++) {
			if (musician.getName() == musicians[i].getName()) {
				gasit = true;
				break;
			}
		}
		if (gasit) {
			System.out.println("A fost sters muzicianul " + musician.getName());

			for (int j = i; j < index - 1; j++) {
				musicians[i] = musicians[i + 1];
			}
			index--;
		} else {
			System.out.println("Nu exista muzicianul");
		}
	}

}
