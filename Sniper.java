package OOP;

public class Sniper extends Charaсter{
    public Sniper(int x, int y, String name) {
        super(x, y, name, 20, "male", 5, 1,10, "rifle");
    }
    public int powerShot(Charaсter charaсter){
        return 2*(charaсter.health - this.damage);
    }
}
