package hust.soict.ICT.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

//	@Override
//	public String toString() {
//		System.out.println("tostring dvd");
//		return "";
//
//	}

	public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost, director, length);
	}

	private static int nbDigitalVideoDiscs = 0;

	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	@Override
	public String toString() {
		return this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength()
				+ ": " + this.getCost() + "$\n";
	}
}
