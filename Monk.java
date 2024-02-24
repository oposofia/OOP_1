package OOP;

public class Monk extends Charaсter{
    public Monk(String name, String gender) {
        super(name, 30, gender, 1, 1, 1, "weapon");
    }
    public void heal(Charaсter charaсter){
        if ((charaсter.health)+5 > charaсter.maxHealth){
            charaсter.health = charaсter.maxHealth;
        } else{
            charaсter.health += 5;
        }
    }
}
