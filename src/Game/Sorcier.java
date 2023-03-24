package Game;

import lombok.*;

import java.util.Scanner;

public class Sorcier {
    @setter @getter static Pet pet;
    @setter @getter static Bag bag;
    @setter @getter static House house;

    public statuc void Run(){
        Sorcier.begin();
        wait.wait(2000);
    }
private static void Begin(){
        Scanner Objet = new Scanner(System.in);
        String name;
    System.out.println("Welcome to Poudlard, My name is Dumbledore, I am the director");
    Wait.wait(2000);
    System.out.println("What's your name ?");
    nom = Objet.nextLine();
    System.out.println("Your name is  " + nom + "that's a great name");
    Wait.wait(2000);
    Pet Name = Pet.randomPet();
    System.out.println("I see that your pet's name is " + Name + ".");
    Wait.wait(2000);
    System.out.println("Nice to meet you ! Follow me we will choose your wand");

}
    public static Sorcier newSorcier(){
        Sorcier sorcier = new Sorcier();
        Sorcier.setWand(bag);
        Sorcier.setPet(pet);
        Sorcier.setHouse(house);
        return Sorcier;
    }

}
