//Author Jerald Huang
//Date 2025-10-27

public class PokemonMaker {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Dragonite", 95, "Air Slash", "Dragon Claw", "Outrage", "Draco Meteor");
        Pokemon p2 = new Pokemon("Snorlax", 96, "Earthquake", "Hyper Beam", "Body Slam", "Lick");
        Pokemon p3 = new Pokemon("Gyarados", 97, "Hydro Pump", "Waterfall", "Aqua Tail", "Outrage");
        Pokemon p4 = new Pokemon("Arcanine", 98, "Fire Fang", "Wild Charge", "Flamethrower", "Snarl");
        Pokemon p5 = new Pokemon("Machamp", 99, "Dynamic Punch", "Earthquake", "Stone Edge", "Bulk Up");
        Pokemon p6 = new Pokemon("Alakazam", 100, "Psychic", "Focus Blast", "Shadow Ball", "Recover");

        // print each Pokemon’s info
        p1.printPokemon();
        p2.printPokemon();
        p3.printPokemon();
        p4.printPokemon();
        p5.printPokemon();
        p6.printPokemon();
    }
}