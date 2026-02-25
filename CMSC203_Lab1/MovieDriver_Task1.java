import java.util.Scanner;

public class MovieDriver_Task1 
{

    public static void main(String[] args) 
    {

        Scanner keyboard = new Scanner(System.in);

        Movie movie = new Movie();

        System.out.println("Please enter the title of a movie");
        String title = keyboard.nextLine();
        movie.setTitle(title);

        System.out.println("Please enter the rating of the movie");
        String rating = keyboard.nextLine();
        movie.setRating(rating);

        System.out.println("Please enter the number of tickets sold for this movie");
        int tickets = keyboard.nextInt();
        movie.setSoldTickets(tickets);

        // Consume the leftover newline after nextInt()
        keyboard.nextLine();

        System.out.println(movie.toString());

    }

}