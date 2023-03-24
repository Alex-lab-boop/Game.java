package Game;

public enum Core {
    coeur_dragon("Drake's heart"),
    plume_griffon("Griffon's leaf"),
    plume_phoenix("Phoenix's leaf"),
    fruit_dragon("Drake's fruit");
    private String nom;
    Core(String nom) {
        this.nom = nom;
    }
}