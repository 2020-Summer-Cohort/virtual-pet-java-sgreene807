package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VirtualPet dog = new VirtualPet();

        System.out.println("Juno the Dog");
        System.out.println(dog.getHunger());
        System.out.println(dog.getThirst());
        System.out.println(dog.getBoredom());
        System.out.println(dog.getWaste());
        System.out.println("What do you want to do?");
        System.out.println("1. Feed Juno");

        scanner.nextInt(1);

    }

}
