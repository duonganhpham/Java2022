public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    //3. Create accessors and mutators for the class DigitalVideoDisc
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    

    //4. Create Constructor method
    public DigitalVideoDisc(String title){
        this.title = title;
    }
    public DigitalVideoDisc(String title, String category){
        this.title = title;
        this.category = category;
    }
    public DigitalVideoDisc(String title, String category, String director){
        this.title = title;
        this.category = category;
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length){
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
    }
     public DigitalVideoDisc(String title, String category, String director, int length, float cost){
         this.title = title;
         this.category = category;
         this.director = director;
         this.length = length;
         this.cost = cost;
    }
    public void updateCost(float cost, float value){
        cost = cost - value;
    }
    public void updateCost(DigitalVideoDisc disc, float value){
        disc.cost = disc.cost - value;
    }
}