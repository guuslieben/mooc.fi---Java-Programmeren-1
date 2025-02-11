public class Player {

    private String name;
    private int goals;

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public Player(String name) { this.name = name; this.goals = 0; }

    public String getName() { return this.name; }

    public int goals() { return this.goals; }


    @Override
    public String toString() {
        return "Player: " + getName() + ", goals " + goals();
    }
}
