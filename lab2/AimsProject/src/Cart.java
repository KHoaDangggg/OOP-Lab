import java.nio.file.DirectoryStream;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(this.qtyOrdered == 20) {
            System.out.println("The cart is almost full");
        }
        else {
            this.itemsOrdered[this.qtyOrdered] = disc;
            System.out.println("The disc has been added");
            this.qtyOrdered++;
        }
    }
   public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int indexRemove = 0;
        if(this.qtyOrdered == 0) {
            System.out.println("The cart is empty");
        }
        else {
            for(int i=0; i<this.qtyOrdered; i++) {
                if(this.itemsOrdered[i] == disc) {
                    indexRemove = i;
                }
            }
            this.qtyOrdered --;
            DigitalVideoDisc newArr[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
            for(int i=0, k=0; i<this.qtyOrdered; i++) {
                if(i == indexRemove) continue;
                newArr[k++] = this.itemsOrdered[i];
            }
            this.itemsOrdered = newArr;
            System.out.println("The disc has been removed.");
        }
   }
   public float totalCost() {
        float sum = 0f;
        if(this.qtyOrdered == 0) {
            return 0f;
        }
        for(int i=0; i<this.qtyOrdered; i++) {
            DigitalVideoDisc disc = this.itemsOrdered[i];
            sum+= disc.getCost();
        }
        return sum;
   }
}