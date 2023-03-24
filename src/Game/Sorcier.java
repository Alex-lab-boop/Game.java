package Game;

import lombok.*;

import javax.naming.Name;
import java.util.Scanner;

public class Sorcier {
    @setter @getter static Pet pet;
    @setter @getter static Baguette baguette;
    @setter @getter static House house;

    public static void Run(){
        Sorcier.start();
        wait.wait(2000);
    }
private static void start(){
        Scanner Objet = new Scanner(System.in);
        String name;
    System.out.println("Welcome to Poudlard, My name is Dumbledore, I am the director");
    wait.wait(2000);
    System.out.println("What's your name ?");
    name = Objet.nextLine();
    System.out.println("Your name is  " + name + "that's a great name");
    wait.wait(2000);
    Pet Name = Pet.randomPet();
    System.out.println("I see that your pet's name is " + Name + ".");
    wait.wait(2000);
    System.out.println("Nice to meet you ! Follow me we will choose your wand");

}
    public static Sorcier newSorcier(){
        Sorcier sorcier = new Sorcier();
        Sorcier.setbaguette(baguette);
        Sorcier.setPet(pet);
        Sorcier.setHouse(house);
        return Sorcier;
    }

}
