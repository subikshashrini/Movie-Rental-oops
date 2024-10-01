public class Movie {
    private String title;
    private String director;
    private int year;

    public Movie(String title,String director,int year){
        this.title=title;
        this.director=director;
        this.year=year;
    }

    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }

    public int getYear(){
        return year;
    }

    public String displaymovieinfo(){
        return (getTitle()+" is directed by "+getDirector()+" and released on year "+getYear());
    }

    public String toString() {
        return title + " directed by " + director + " (" + year + ")";
    }
}
