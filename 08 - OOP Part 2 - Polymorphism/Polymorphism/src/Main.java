import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie thisMovie = new Adventure("Star Wars");
        thisMovie.watchMovie();

        Adventure thisAdventure = new Adventure("Adventure Movie");
        thisAdventure.watchMovie();

        Movie theStaticMovie = Movie.getMovie("Adventure", "Star Wars");
        theStaticMovie.watchMovie();

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, " + " S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();

        }
    }
}
