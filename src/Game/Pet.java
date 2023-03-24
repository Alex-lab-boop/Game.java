package Game;
import java.util.Random;

public class Pet {
    Bird("Bird"),
    Cat("Cat"),
    rat("rat"),
    Dog("Dog"),
    Frog("Frog");
    private String nom;
    Pet(String nom) {
        this.nom = nom;
    }
    private static final Random PRNG = new Random();
    public static Pet randomPet() {
        Pet[] pets = values();
        return pets[PRNG.nextInt(pets.length)];
    }


}

}
