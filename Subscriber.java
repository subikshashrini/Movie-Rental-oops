import java.util.ArrayList;
import java.util.List;
public class Subscriber {
    private String Subsname;
    private int Subsid;
    public List<Movie> Rentedmovies;

    public Subscriber(String subsname , int id){
        this.Subsname=subsname;
        this.Subsid=id;
        this.Rentedmovies=new ArrayList<>();
    }

    public String getSubsname(){
        return Subsname;
    }

    public int getSubsid(){
        return Subsid;
    }

    public void Rentmovies(Movie movie){
        Rentedmovies.add(movie);
        //System.out.println(getSubsname()+" Your movie "+movie.getTitle()+" has been rented succeessfully! ");
    }
     public void Removerented(Movie movie){
        Rentedmovies.remove(movie);
         System.out.println(getSubsname()+" Your movie "+movie.getTitle()+" has been removed successfully ");
     }

     public  List<Movie> getRentedmovies(){
        return Rentedmovies;
     }


}
