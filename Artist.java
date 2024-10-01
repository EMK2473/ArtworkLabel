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
        System.out.println(birthYear);
            if(deathYear != -1 ){
               System.out.println(deathYear);
            }
    }
 }