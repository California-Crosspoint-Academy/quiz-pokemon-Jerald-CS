public class Pokemon {
    private String name;
    private int level;

    // Constructor with parameters
    public Pokemon(String n, int l) {
        name = n;
        level = l;
    }
    

    // Getter methods
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}