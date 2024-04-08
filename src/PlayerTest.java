
public class PlayerTest {

    public static void main(String[] args) {
        Player player = new Player(2, 3);
        player.teleport(9, 10);

        System.out.println(player.getLocation());
    }

}

class Player {
    private int x;
    private int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void teleport(int x, int y) {
        x = this.x;
        y = this.y;
    }

    public String getLocation() {
        return String.format("(%d, %d)", x, y);
    }
}