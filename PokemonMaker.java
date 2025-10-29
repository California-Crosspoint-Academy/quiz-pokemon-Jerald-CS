// Author: Jerald Huang
// Date: 2025-10-27

public class PokemonMaker {
    public static void main(String[] args) {

        // make an array of Pokemon objects
        Pokemon[] team = {
            new Pokemon("Dragonite", 95, "Air Slash", "Dragon Claw", "Outrage", "Draco Meteor"),
            new Pokemon("Snorlax", 96, "Earthquake", "Hyper Beam", "Body Slam", "Lick"),
            new Pokemon("Gyarados", 97, "Hydro Pump", "Waterfall", "Aqua Tail", "Outrage"),
            new Pokemon("Arcanine", 98, "Fire Fang", "Wild Charge", "Flamethrower", "Snarl"),
            new Pokemon("Machamp", 99, "Dynamic Punch", "Earthquake", "Stone Edge", "Bulk Up"),
            new Pokemon("Alakazam", 100, "Psychic", "Focus Blast", "Shadow Ball", "Recover")
        };

        // loop through the array and print each Pokemon’s info
        for (Pokemon z : team) {
            z.printPokemon();
        }
    }
}
