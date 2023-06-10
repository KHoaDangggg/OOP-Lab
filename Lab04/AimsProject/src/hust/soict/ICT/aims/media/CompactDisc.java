package hust.soict.ICT.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();

	public String getArtist() {
		return artist;
	}

	public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist,
			ArrayList<Track> tracks) {
		super(id, title, category, cost, director, length);
		this.artist = artist;
		this.tracks = tracks;
	}

	public void addTrack(Track name) {
		if (this.tracks.contains(name)) {
			System.out.println(name + "is already in list");
			return;
		}
		this.tracks.add(name);
		System.out.println(name + "is added");
	}

	public void removeAuthor(Track name) {
		if (!this.tracks.contains(name)) {
			System.out.println(name + "is not in list");
			return;
		}
		this.tracks.remove(name);
		System.out.println(name + "is removed");
	}

	@Override
	public int getLength() {
		int len = 0;
		for (Track t : tracks) {
			len += t.getLength();
		}
		return len;
	}

	@Override
	public void play() {
		System.out.println("The compact disc belongs to artirst" + artist);
		System.out.println("The compact disc has tracks including: ");
		for (Track t : this.tracks) {
			System.out.println(t.getTitle() + ",");
		}
		System.out.println("Play tracks respectively: ");
		for (Track t : this.tracks) {
			t.play();
		}
	}

//	@Override
//	public String toString() {
//		System.out.println("tostring cd");
//		return "";
//
//	}
	@Override
	public String toString() {
		return this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength()
				+ ": " + this.getCost() + "$\n";
	}
}
