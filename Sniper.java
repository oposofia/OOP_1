package OOP;

public class Sniper extends Charaсter{
    public Sniper(String name, String gender) {
        super(name, 20, gender, 5, 1,10, "rifle");
    }
    public int powerShot(Charaсter charaсter){
        return 2*(charaсter.health - this.damage);
    }
}
