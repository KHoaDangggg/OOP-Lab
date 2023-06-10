package hust.soict.ICT.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();

	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		if (this.authors.contains(authorName)) {
			System.out.println(authorName + "is already in list");
			return;
		}
		this.authors.add(authorName);
		System.out.println(authorName + "is added");
	}

	public void removeAuthor(String authorName) {
		if (!this.authors.contains(authorName)) {
			System.out.println(authorName + "is not in list");
			return;
		}
		this.authors.remove(authorName);
		System.out.println(authorName + "is removed");
	}

//
//	@Override
//	public String toString() {
//		System.out.println("tostring Book");
//		return "";
//
//	}
	@Override
	public String toString() {
		return this.getTitle() + " - " + this.getCategory() + " - " + ": " + this.getCost() + "$\n";
	}
}
