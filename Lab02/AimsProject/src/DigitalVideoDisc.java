public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public float getCost() {
        return cost;
    }
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
    public String getCategory() {
        return category;
    }
    public String getTitle() {
        return title;
    }
    public DigitalVideoDisc(String title, String category, String director) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
    }
    public DigitalVideoDisc(int length) {
        super();
        this.length = length;
    }
    public DigitalVideoDisc(float cost) {
        super();
        this.cost = cost;
    }
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
}