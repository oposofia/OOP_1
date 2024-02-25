package OOP;

public class Wizard extends Charaсter{
    public Wizard(int x, int y, String name) {

        super(x, y, name, 5, "male", 1, 1, 1, "poison");
    }

    public void fireBall(Charaсter char1, Charaсter char2, Charaсter char3){
        char1.health -= this.damage;
        char2.health -= this.damage;
        char3.health -= this.damage;
    }
}
