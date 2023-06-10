package hust.soict.ICT.aims.store;

import java.util.ArrayList;

import hust.soict.ICT.aims.media.Media;

public class Store {
	private ArrayList<Media> itemInStore = new ArrayList<>();

	public ArrayList<Media> getItemInStore() {
		return itemInStore;
	}

	public void addMedia(Media... medias) {
		for (Media media : medias) {
			itemInStore.add(media);
		}
		System.out.println("Added " + itemInStore.size() + " items");
	}

	public void removeMedia(Media... medias) {
		for (Media rmMedia : medias) {
			for (Media t : this.itemInStore) {
				Boolean correct = t.getCategory().equals(rmMedia.getCategory()) && t.getCost() == rmMedia.getCost()
						&& t.getId() == rmMedia.getId() && t.getTitle().equals(rmMedia.getTitle());
				if (correct) {
					this.itemInStore.remove(rmMedia);
					System.out.println("Removed successfully");
					return;
				}
			}
			System.out.println("No item match");
		}
	}

}
