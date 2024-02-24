package OOP;

abstract class Charaсter {
    String name;
    int health;
    int maxHealth;
    String gender;
    int speed;
    int armor;
    int damage;
    String weapon;

    public Charaсter(String name, int health, String gender,
                     int speed, int armor, int damage, String weapon){
        maxHealth = health;
        this.name = name;
        this.health = health;
        this.gender = gender;
        this.speed = speed;
        this.armor = armor;
        this.damage = damage;
        this.weapon = weapon;
    }
    protected int go(int place){
        return place-speed;
    }

    protected int attack(Charaсter charaсter){
        return charaсter.health-damage;
    }

    protected int getDamage(Charaсter charaсter){
        return health- charaсter.damage;
    }

    protected void retreat(){
        System.out.println("персонаж сбежал с поля боя");
    }

    public void print(){
        System.out.println("Name: " + name + "   Health: " + health + "   Gender: " + gender +
                "   Speed: " + speed + "   Armor: " + armor + "   Damage: " + damage +
                "   Weapon: " + weapon);
    }

    /*
    protected void getInfo(){
        System.out.println(String.format("Name: %s Health: %d Gender: %s Speed: %d Armor: %d Damage: %d Weapon: %s",
                this.name, this.health, this.gender, this.speed, this.armor, this.damage, this.weapon));
    }

     */
}

