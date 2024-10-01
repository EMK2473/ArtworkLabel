public class Artist {
    private String artistName;
    private int birthYear;
    private int deathYear;

    public Artist() {
        this.artistName = "unknown";
        this.birthYear = -1;
        this.deathYear = -1;
    }
 
    public Artist(String name, int yearBorn, int yearDied) {
        this.artistName = name;
        this.birthYear = yearBorn;
        this.deathYear = yearDied;
    }
    
    public String getName(){
        return artistName;
    }
     
     public int getBirthYear() {
        return birthYear;   
    }
     
     public int getDeathYear() {
        return deathYear;
    }
 
    public void printInfo(){
        if(deathYear == -1 && birthYear == -1){
            System.out.println("Artist: " + artistName + " (unknown)" );
        }
        else if(deathYear != -1  && birthYear != -1){
            System.out.println("Artist: " + artistName + " (" + birthYear + " to " + deathYear +")" );
        }
        else {
            System.out.println("Artist: " + artistName + " (" + birthYear + " to present)" );   
        }
    }
 }