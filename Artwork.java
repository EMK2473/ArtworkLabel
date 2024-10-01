public class Artwork {
    // TODO: Declare private fields - title, yearCreated
    private String title;
    private int yearCreated;
    
    // TODO: Declare private field artist of type Artist 
    private Artist artist;    
    
    // TODO: Define default constructor
    public Artwork() {
        this.title = "unknown";
        this.yearCreated = -1;
        this.artist = new Artist();
    }
    
    // TODO: Define get methods: getTitle(), getYearCreated()

    public String getTitle() {
        return title;
    }

    public int getYearCreated(){
        return yearCreated;
    }
 
    // TODO: Define second constructor to initialize 
    //       private fields (title, yearCreated, artist)

    public Artwork(String artTitle, int artYearCreated, Artist artist) {
        this.title = artTitle;
        this.yearCreated = artYearCreated;
        this.artist = artist;

    }
 
    // TODO: Define printInfo() method
    //       Call the printInfo() method in Artist.java to print an artist's information
    public void printInfo(){
        artist.printInfo();
        System.out.println("Title: " + title + ", " + yearCreated);
    }
 }
 