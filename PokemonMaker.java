public class PokemonMaker {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Dragonite", 95, "Air Slash", "Dragon Claw", "Outrage", "Draco Meteor"); //Dragon and flying type pokemon  
        System.out.println(p1.getName() + " (L. " + p1.getLevel() + ")");
        System.out.println("---------------------");
        System.out.println("1) " + p1.getMove1());
        System.out.println("2) " + p1.getMove2());
        System.out.println("3) " + p1.getMove3());
        System.out.println("4) " + p1.getMove4());
        System.out.println();

        Pokemon p2 = new Pokemon("Snorlax", 96, "Earthquake", "Hyper Beam", "Body Slam", "Lick"); //tanky he normal type and does decent damage
        System.out.println(p2.getName() + " (L. " + p2.getLevel() + ")");
        System.out.println("---------------------");
        System.out.println("1) " + p2.getMove1());
        System.out.println("2) " + p2.getMove2());
        System.out.println("3) " + p2.getMove3());
        System.out.println("4) " + p2.getMove4());
        System.out.println();

        Pokemon p3 = new Pokemon("Gyarados", 97, "Hydro Pump", "Waterfall", "Aqua Tail", "Outrage"); //Water and flying 
        System.out.println(p3.getName() + " (L. " + p3.getLevel() + ")");
        System.out.println("---------------------");
        System.out.println("1) " + p3.getMove1());
        System.out.println("2) " + p3.getMove2());
        System.out.println("3) " + p3.getMove3());
        System.out.println("4) " + p3.getMove4());
        System.out.println();

        Pokemon p4 = new Pokemon("Arcanine", 98, "Fire Fang", "Wild Charge", "Flamethrower", "Snarl"); //fast attack speed and good fire 
        System.out.println(p4.getName() + " (L. " + p4.getLevel() + ")");
        System.out.println("---------------------");
        System.out.println("1) " + p4.getMove1());
        System.out.println("2) " + p4.getMove2());
        System.out.println("3) " + p4.getMove3());
        System.out.println("4) " + p4.getMove4());
        System.out.println();

        Pokemon p5 = new Pokemon("Machamp", 99, "Dynamic Punch", "Earthquake", "Stone Edge", "Bulk Up"); //He the second best fighting in gen 1 behind mewtwo 
        System.out.println(p5.getName() + " (L. " + p5.getLevel() + ")");
        System.out.println("---------------------");
        System.out.println("1) " + p5.getMove1());
        System.out.println("2) " + p5.getMove2());
        System.out.println("3) " + p5.getMove3());
        System.out.println("4) " + p5.getMove4());
        System.out.println();

        Pokemon p6 = new Pokemon("Alakazam", 100, "Psychic", "Focus Blast", "Shadow Ball", "Recover"); //special and psychic type attacker 
        System.out.println(p6.getName() + " (L. " + p6.getLevel() + ")");
        System.out.println("---------------------");
        System.out.println("1) " + p6.getMove1());
        System.out.println("2) " + p6.getMove2());
        System.out.println("3) " + p6.getMove3());
        System.out.println("4) " + p6.getMove4());
    }
}