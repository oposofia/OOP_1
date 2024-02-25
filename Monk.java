package OOP;

public class Monk extends Charaсter{
    public Monk(int x, int y, String name) {
        super(x, y, name, 30, "male", 1, 1, 1, "health");
    }
    public void heal(Charaсter charaсter){
        if ((charaсter.health)+5 > charaсter.maxHealth){
            charaсter.health = charaсter.maxHealth;
        } else{
            charaсter.health += 5;
        }
    }
}
