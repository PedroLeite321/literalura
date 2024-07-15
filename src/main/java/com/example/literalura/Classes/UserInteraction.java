package com.example.literalura.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Scanner;

@Entity
public class UserInteraction {
    @Id

    private int userName;
    private int userSurname;

    Scanner scanner = new Scanner(System.in);

    public void welcomeUser() {

        System.out.println(" ................. \n\n");

        System.out.println("\' ! *!Welcome to literalura!* ! \'");

        System.out.println("\n\n ................. ");
    }

    public void choicesInfo() {
        // Shows all possible choices this program offers.
        System.out.println("\' 1 - Search for a book title");
        System.out.println("\' 2 - List your searching history");
        System.out.println("\' 3 - List books by author name");
        System.out.println("\' 4 - List books by alive authors");
        System.out.println("\' 5 - List books by dead authors");

        System.out.println("\' \' 0 - Quit \' \'");

        getUserChoice();

    }

    public void getUserChoice() {
        int userChoice;

        System.out.println("Please select the option you desire.");
        userChoice = scanner.nextInt();

        possibleChoices(userChoice);

    }

    public void possibleChoices( int choice ) {
        //gutendex interaction here:

        GutendexService mySearch = new GutendexService();


    }

}
