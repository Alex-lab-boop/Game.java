package Game;
import java.util.ArrayList;
import java.util.Random;

public class Hat {
    public static void ChooseHouse() {
        System.out.println("Here is the Hat which will decide which House you go ");
        wait.wait(2000);
        ArrayList<String> houses = new ArrayList<>();
        houses.add("Gryffindor");
        houses.add("Slytherin");
        houses.add("Ravenclaw ");
        houses.add("Hufflepuff ");
        Random rand = new Random();
        int ChoosedHouse = rand.nextInt(houses.size());
        String house = houses.get(ChoosedHouse);
        System.out.println("The hat choosed your House ! Lucky you ! Your house is :" + house);
    }
}

