import models.VirtualPet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to Virtual Pet!");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please name your pet");

        String userInput = scanner.nextLine();

        VirtualPet pet = new VirtualPet(userInput);

        boolean shouldContinue = true;


        while (shouldContinue) {

            //print pet status and commands
            System.out.println("Name: " + pet.getName());
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("Thirst: " + pet.getThirst());
            System.out.println("Boredom: " + pet.getBoredom());
            System.out.println("--------------------------------");

            //take user input
            System.out.println("Please choose a command");
            System.out.println("1. Pass time");
            System.out.println("2. Feed " + pet.getName());
            System.out.println("3. Water " + pet.getName());
            System.out.println("4. Play with " + pet.getName());
            System.out.println("5. Exit Virtual Pet App");
            System.out.println("--------------------------------");

            System.out.println("Command #: ");
            userInput = scanner.nextLine();

            //execute whatever user input is

            if (userInput.equals("1")) {
                //tick pet
                printFeedback("Passing time...");
                pet.tick();
            } else if (userInput.equals("2")) {
                //feed
                printFeedback("Feeding " + pet.getName());
                pet.feed();
            } else if (userInput.equals("3")) {
                //water
                printFeedback("Giving water to " + pet.getName());
                pet.drink();
            } else if (userInput.equals("4")) {
                //play
                printFeedback("Playing with " + pet.getName());
                pet.play();
            } else if (userInput.equals("5")) {
                System.out.println("Goodbye");
                //exit the app
                shouldContinue = false;
            }

            if (pet.deadPet()) {
                System.out.println("You're a terrible owner, your pet has died. Game over");
                shouldContinue = false;
            }

        }

    }

    private static void printFeedback(String feedback) {
        System.out.println("\n" + feedback + "\n");
    }

}
