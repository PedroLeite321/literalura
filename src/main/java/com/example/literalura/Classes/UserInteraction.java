package com.example.literalura.Classes;

import jakarta.persistence.Entity;

import java.util.Scanner;

@Entity
public class UserInteraction {


    private int userName;
    private int userSurname;

    Scanner scanner = new Scanner(System.in);

    public void welcomeUser() {

        System.out.println(" ................. \n\n");

        System.out.println("\' ! *!Welcome to literalura!* ! \'");

        System.out.println("\n\n ................. ");
    }

    public void availableChoices() {
        // Shows all possible choices this program offers.
        System.out.println("");
    }

    public int getUserChoice() {
        int userChoice;

        System.out.println("Please select the option you desire.");
        userChoice = scanner.nextInt();

        return userChoice;
    }

    public
}
