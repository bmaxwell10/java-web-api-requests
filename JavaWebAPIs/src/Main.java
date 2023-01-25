import java.util.Scanner;

public class Main {

    public static void main(String[] argv) {


        System.out.println("Would you like to complete a search for info by zip code, tv show, "
                + "song artist or song title?\n" + "\tTo search by: \n"
                + "\tZip code enter '1'\n"
                + "\tTelevision show enter '2'\n"
                + "\tSong artist or song title enter '3'\n"
                + "\tTo exit program enter 'Q'.\n");

        Scanner inputCmd = new Scanner(System.in);
        String cmd = "";


        while (!cmd.equalsIgnoreCase("q")) {
            System.out.print("\n");
            System.out.print("Command: ");
            cmd = inputCmd.next().toUpperCase();  // Accesses user input as a string
            System.out.println();

            switch (cmd) {
                case "1": {
                    System.out.println("Please enter a zip code: ");
                    Scanner inputInfo = new Scanner(System.in);
                    String zipCode = inputInfo.next();
                    System.out.println(new ZipCode(zipCode).get() + "\n");
                    break;
                }

                case "2": {
                    System.out.println("Please enter a tv show title: ");
                    Scanner inputInfo = new Scanner(System.in);
                    String tvShow = inputInfo.next();
                    System.out.println(new TvShows(tvShow).get() + "\n");
                    break;
                }

                case "3": {
                    System.out.println("Please enter a song title or artist name " +
                            "(with hyphens between words if title is longer than a single word): ");
                    Scanner inputInfo = new Scanner(System.in);
                    String songArtistOrTitle = inputInfo.next();
                    System.out.println(new Music(songArtistOrTitle).get() + "\n");
                    break;
                }

                case "Q":
                    System.out.println("Thank you for using this program for your searches! " +
                            "\nThe program has been exited.");
                    break;

                default:
                    System.out.println("Invalid entry. Please try again.\n");
            }
        }
        inputCmd.close();
    }
}
