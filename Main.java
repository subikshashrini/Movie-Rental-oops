import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Thani oruvan", "Vetrimaran", 2018);
        Movie movie2 = new Movie("Love today", "Pradeep", 2022);
        Movie movie3 = new Movie("I", "Sankar", 2015);
        Movie movie4 = new Movie("GOAT", "Venkat prabhu", 2024);
        Movie movie5 = new Movie("Vada Chennai", "Vetrimaaran", 2018);
        Movie movie6 = new Movie("Super Deluxe", "Thiagarajan Kumararaja", 2019);
        Movie movie7 = new Movie("Asuran", "Vetrimaaran", 2019);
        Movie movie8 = new Movie("Master", "Lokesh Kanagaraj", 2021);
        Movie movie9 = new Movie("Karnan", "Mari Selvaraj", 2021);
        Movie movie10 = new Movie("Jai Bhim", "T.J. Gnanavel", 2021);
        Movie movie11 = new Movie("Naan Kadavul", "Bala", 2009);
        Movie movie12 = new Movie("Viswasam", "Siva", 2019);
        Movie movie13 = new Movie("Mersal", "Atlee", 2017);
        Movie movie14 = new Movie("Sethupathi", "S. U. Arun Kumar", 2016);
        Movie movie15 = new Movie("Aruvi", "Arun Prabhu Purushothaman", 2016);

        System.out.println(movie1.displaymovieinfo());
        System.out.println(movie2.displaymovieinfo());
        System.out.println(movie3.displaymovieinfo());

        //List<Movie> rentedmovie = new ArrayList<>();

        Subscriber sub1 = new Subscriber("Subiksha", 1);
        Subscriber sub2 = new Subscriber("Shrini", 2);
        Subscriber sub3 = new Subscriber("Imsai", 3);
        Subscriber sub4 = new Subscriber("Murugan", 4);

        sub1.Rentmovies(movie5);
        sub1.Rentmovies(movie2);

        sub2.Rentmovies(movie6);
        sub2.Rentmovies(movie7);

        sub3.Rentmovies(movie1);
        sub3.Rentmovies(movie3);

        sub4.Rentmovies(movie4);
        sub4.Rentmovies(movie10);
        sub4.Rentmovies(movie15);
        sub4.Rentmovies(movie12);

        printrentedmovies(sub1);
       printrentedmovies(sub2);
       printrentedmovies(sub3);
       printrentedmovies(sub4);
        Rental rental1 = new Rental();

        rental1.addmovie(movie1);
        rental1.addmovie(movie2);
        rental1.addmovie(movie3);
        rental1.addmovie(movie4);
        rental1.addmovie(movie5);
        rental1.addmovie(movie6);
        rental1.addmovie(movie7);
        rental1.addmovie(movie8);
        rental1.addmovie(movie9);
        rental1.addmovie(movie10);
        rental1.addmovie(movie11);
        rental1.addmovie(movie12);
        rental1.addmovie(movie13);
        rental1.addmovie(movie14);
        rental1.addmovie(movie15);


        printavailablemovie(rental1);

        rental1.findmoviebytitle("Love today");

    }


    public static void printrentedmovies(Subscriber subscriber){
        List<Movie> rentedmoviebysub = subscriber.getRentedmovies();

        System.out.println("Rented movies of "+subscriber.getSubsname()+" are following");

        if(rentedmoviebysub.isEmpty()){
            System.out.println("No movies Rented");
        }
        else{
            for(Movie movie: rentedmoviebysub){
                System.out.println(movie);
            }
        }
    }

    public static void printavailablemovie(Rental rent){
        System.out.println("The available movies for Rental are ");

        List<Movie> availmov = rent.viewAvailablemovies();

        for(Movie movie: availmov){
            System.out.println(movie);
        }
    }

}

/*
import java.util.*;

public class UserInputCode {

    public int maxBooks(int input1, int input2, int[] input3) {
        return collectBooks(input1, input2, input3);
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int collectBooks(int numShelves, int maxBooks, int[] books) {
        int totalBooks = 0;

        for (int i = 0; i < numShelves; i++) {
            if (isPrime(i + 1)) { // Check if the shelf index (1-based) is prime
                totalBooks += Math.min(maxBooks, books[i]); // Collect maxBooks or available books
            }
        }

        return totalBooks;
    }

    public static void main(String[] args) {
        UserInputCode userInputCode = new UserInputCode();

        // Test case 1
        int numShelves1 = 2;
        int maxBooks1 = 4;
        int[] books1 = {10, 2};
        int output1 = userInputCode.maxBooks(numShelves1, maxBooks1, books1);
        System.out.println(output1); // Output: 2

        // Test case 2
        int numShelves2 = 4;
        int maxBooks2 = 5;
        int[] books2 = {3, 7, 5, 6};
        int output2 = userInputCode.maxBooks(numShelves2, maxBooks2, books2);
        System.out.println(output2); // Output: 10
    }
}

 */