public class Artist {
    // TODO: Declare private fields - artistName, birthYear, deathYear
    private String artistName;
    private int birthYear;
    private int deathYear;

    // TODO: Define default constructor
    public Artist() {
        this.artistName = "unknown";
        this.birthYear = -1;
        this.deathYear = -1;
    }
 
    // TODO: Define second constructor to initialize 
    //       private fields (artistName, birthYear, deathYear)
    public Artist(String name, int yearBorn, int yearDied) {
        this.artistName = name;
        this.birthYear = yearBorn;
        this.deathYear = yearDied;
    }
    
    // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
    public String getName(){
        return artistName;
    }
     
     public int getBirthYear() {
        return birthYear;   
    }
     
     public int getDeathYear() {
        return deathYear;
    }
 
    // TODO: Define printInfo() method
    //       If deathYear is entered as -1, only print birthYear
    public void printInfo(){
        System.out.println(birthYear);
            if(deathYear != -1 ){
               System.out.println(deathYear);
            }
    }
    
 
 }