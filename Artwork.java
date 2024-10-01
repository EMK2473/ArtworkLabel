public class Artwork {
    private String title;
    private int yearCreated;
    private Artist artist;    
    
    public Artwork() {
        this.title = "unknown";
        this.yearCreated = -1;
        this.artist = new Artist();
    }

    public String getTitle() {
        return title;
    }

    public int getYearCreated(){
        return yearCreated;
    }

    public Artwork(String artTitle, int artYearCreated, Artist artist) {
        this.title = artTitle;
        this.yearCreated = artYearCreated;
        this.artist = artist;

    }
 
    public void printInfo(){
        artist.printInfo();
        System.out.println("Title: " + title + ", " + yearCreated);
    }
 }
 