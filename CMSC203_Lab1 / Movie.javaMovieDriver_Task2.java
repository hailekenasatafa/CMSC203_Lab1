import java.util.Scanner;

public class MovieDriver_Task2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String continueAnswer;

        do {
            // Create a new Movie for each loop iteration
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

            // Consume leftover newline after nextInt()
            keyboard.nextLine();

            // Print the movie info
            System.out.println(movie.toString());

            // Ask if user wants to enter another
            System.out.println("Do you want to enter another movie? (y or n)");
            continueAnswer = keyboard.nextLine();

        } while (continueAnswer.equalsIgnoreCase("y") || 
                 continueAnswer.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");
    }
}
