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

    // Get methods 
    public String getName(){ 
        return name; 
    }
    
    public int getLevel(){ 
        return level; 
    }
    
    public String getMove1(){ 
        return move1;
    }
    
    public String getMove2(){ 
        return move2; 
    }
    
    public String getMove3(){
        return move3; 
    }
    
    public String getMove4(){
        return move4;
    }
}