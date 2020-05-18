package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VirtualPet dog = new VirtualPet();
        System.out.println("Juno the Dog");
        System.out.println("Hunger is " + dog.getHunger());
        System.out.println("Thirst is " + dog.getThirst());
        System.out.println("Boredom is " + dog.getBoredom());
        System.out.println("Waste is " + dog.getWaste());

        promptUser();


        while (dog.getHunger() < 30 && dog.getThirst() < 30 && dog.getBoredom() < 20 && dog.getWaste() < 20) {

            int numberSelected = scanner.nextInt();

            if (numberSelected == 1) {
                dog.feed();
                System.out.println("Hunger is now " + dog.getHunger() + ".");
            } else if (numberSelected == 2) {
                dog.water();
                System.out.println("Thirst is now " + dog.getThirst() + ".");
            } else if (numberSelected == 3) {
                dog.play();
                System.out.println("Boredom is now " + dog.getBoredom() + ".");
            } else if (numberSelected == 4) {
                dog.takeOutside();
                System.out.println("Waste is now " + dog.getWaste() + ".");
            } else if (numberSelected == 0) {
                System.out.println("Exiting game now.");
                System.exit(0);
            } else {
                System.out.println("Invalid. Please enter a number 1 through 4.");
            }
            promptUser();
            dog.tick();
        }
        System.out.println("You lose!");
        promptUser();
    }

    public static void promptUser() {
        System.out.println("What do you want to do?");
        System.out.println("1. Feed Juno");
        System.out.println("2. Give Juno water");
        System.out.println("3. Play with Juno");
        System.out.println("4. Take Juno out");
        System.out.println("Press 0 to exit game.");
    }
}




