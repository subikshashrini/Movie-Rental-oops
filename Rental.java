import java.util.List;
import java.util.ArrayList;
public class Rental {
    List<Movie> Availablemovies;
    List<Subscriber> Availablesubs;
    //List<>

    public Rental() {
         Availablemovies= new ArrayList<>();
        Availablesubs = new ArrayList<>();
        //rentals = new ArrayList<>();
    }

    public void addmovie(Movie movie){
        Availablemovies.add(movie);
    }

    public void removeavailmovie(Movie movie){
        if(Availablemovies.remove(movie)){
            System.out.println(movie.getTitle()+" removed successfully! ");
        }
        else{
            System.out.println("Movie is not in available list ");
        }
    }

    public void addsubscriber(Subscriber subscriber){
        Availablesubs.add(subscriber);
    }

    public void removeavailsubs(Subscriber subscriber){
        if(Availablesubs.remove(subscriber)){
            System.out.println(subscriber.getSubsname()+" removed successfully! ");
        }
        else{
            System.out.println("Subscriber is not in available list ");
        }
    }

    public List<Movie> viewAvailablemovies(){
        return Availablemovies;
    }

    public void findmoviebytitle(String title){
        boolean found = false;
        for(Movie movie:Availablemovies){
            if(movie.getTitle().equalsIgnoreCase(title)){
                System.out.println(movie);
                found=true;
                break;
            }

        }
        if(!found){
            System.out.println("Movie not found "+title);
        }
        //return null;
    }






}
