package Game;
import lombok.*;
import java.util.Scanner;

public class baguette {
    @Setter @Getter static Core core;
    @Setter @Getter static int size;
    @Setter @Getter static baguette baguette;

    public static void Run(){
        baguette.Begin();
        wait.wait(2000);
        baguette.ChooseWand();
    }
    private static void Begin(){
        System.out.println("Welcome to the Wand Shop. You will choose here your first Wand !");
        wait.wait(2000);
        System.out.println("Here are the different wands");
    }
    public static baguette ChooseWand(){
        baguette baguette1 = new baguette();
        baguette1.setCore(ChooseCore());
        Game.baguette.setSize(ChooseSize());
        return baguette1;
    }
    private static Core ChooseCore(){
        Scanner obj = new Scanner(System.in);
        for (Core c: Core.values()){
            System.out.println(c.toString().replace("_", " "));
            wait.wait(500);
        }
        System.out.println("Do your choice");
        String ChoiceCore = obj.nextLine();
        Core ChoosedCore;
        switch (ChoiceCore){
            case "Drake's heart":
                ChoosedCore = Core.coeur_dragon;
                break;
            case "Griffon's leaf":
                ChoosedCore = Core.plume_griffon;
                break;
            case "Phoenix's leaf":
                ChoosedCore = Core.plume_phoenix;
                break;
            case "Drake's fruit":
                ChoosedCore = Core.fruit_dragon;
                break;
            default:
                ChoosedCore = Core.coeur_dragon;
                break;
        }
        System.out.println("Your choice is " + ChoosedCore.toString().replace("_", " "));
        return ChoosedCore;
    }

    private static int ChooseSize(){
        Scanner obj = new Scanner(System.in);
        int ChoosedSize;
        System.out.println("That's great, you have to choose your size now !");
        wait.wait(2000);
        do {
            System.out.println("We have differents wands from 20 to 40 centimetters");
            ChoosedSize = obj.nextInt();
        } while ((ChoosedSize < 20) || (ChoosedSize > 40));
        System.out.println("Fine, your size will be " + ChoosedSize + " centimetters.");
        return ChoosedSize;
    }
}

