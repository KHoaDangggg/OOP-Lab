package hust.soict.ICT.aims.cart;

import java.util.ArrayList;

import hust.soict.ICT.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	public float totalCost() {
		float sum = 0f;
		if (this.itemsOrdered.size() == 0) {
			return 0f;
		}
		for (Media m : this.itemsOrdered) {
			sum += m.getCost();
		}
		return sum;
	}

	public void print() {
		if (this.itemsOrdered.size() == 0) {
			System.out.println("No item has been ordered");
			return;
		}
		System.out.println("***********************CART***********************\n" + "Ordered Items:");
		for (Media item : this.itemsOrdered) {
			if (item == null)
				break;
			System.out.println(item.toString());
		}
		System.out.println("Total cost:" + this.totalCost() + "\n***************************************************");
	}

	public void addMedia(Media m) {

		this.itemsOrdered.add(m);
		System.out.println("Added successfully");
	}

	public void removeMedia(Media rmMedia) {
		if (this.itemsOrdered.size() == 0) {
			System.out.println("No media in list to remove");
			return;
		}
		for (Media t : this.itemsOrdered) {
			Boolean correct = t.getCategory().equals(rmMedia.getCategory()) && t.getCost() == rmMedia.getCost()
					&& t.getId() == rmMedia.getId() && t.getTitle().equals(rmMedia.getTitle());
			if (correct) {
				this.itemsOrdered.remove(rmMedia);
				System.out.println("Removed successfully");
				return;
			}
		}
		System.out.println("No item match with your item");
	}

	public void searchByTitle(String title) {
		int count = 0;
		System.out.println("***********************CART***********************\n" + "Items with Title:");
		for (Media item : this.itemsOrdered) {
			if (item.isMatchTitle(title)) {
				count++;
				System.out.println(item.toString());
			}
		}
		if (count == 0)
			System.out.println("No item has that title");
		System.out.println("***************************************************");
	}

	public void searchById(int id) {
		int count = 0;
		System.out.println("***********************CART***********************\n" + "Items with ID:");
		for (Media item : this.itemsOrdered) {
			if (item.isMatchId(id)) {
				count++;
				System.out.println(item.toString());
				break;
			}
		}
		if (count == 0)
			System.out.println("No item has that id");
		System.out.println("***************************************************");
	}

	public void sortByCostTitle() {
		java.util.Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
		this.print();
	}

	public void sortByTitleCost() {
		java.util.Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
		this.print();
	}
}