//Author Jerald Huang
//Date 2025-10-27

public class Pokemon {
    private String name;
    private int level;
    private String move1;
    private String move2;
    private String move3;
    private String move4;

    //make pokemon
    public Pokemon(String n, int l, String m1, String m2, String m3, String m4) {
        name = n;
        level = l;
        move1 = m1;
        move2 = m2;
        move3 = m3;
        move4 = m4;
    }

    void printPokemon () {
        System.out.println(name + " (Level" + level + ")");
        System.out.println("1) " + move1);
        System.out.println("2) " + move2);
        System.out.println("3) " + move3);
        System.out.println("4) " + move4);
        System.out.println();
    }
}
