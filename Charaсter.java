package OOP;

import java.util.ArrayList;

abstract class Charaсter {
    String name;
    int health;
    int maxHealth;
    String gender;
    int speed;
    int armor;
    int damage;
    String weapon;
    int x, y;

    Place position;

    public Charaсter(int x, int y, String name, int health, String gender,
                     int speed, int armor, int damage, String weapon){
        position = new Place(x,y);
        maxHealth = health;
        this.name = name;
        this.health = health;
        this.gender = gender;
        this.speed = speed;
        this.armor = armor;
        this.damage = damage;
        this.weapon = weapon;
        this.x = x;
        this.y = y;

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
        System.out.println("x = " + x + " y = " + y + " Class: " +
                getClass().getSimpleName() + " Name: " + name + "   Health: " + health + "   Gender: " + gender +
                "   Speed: " + speed + "   Armor: " + armor + "   Damage: " + damage +
                "   Weapon: " + weapon);
    }

    public void printName(){
        System.out.println("x = " + x + " y = " + y + " Class: " +
                getClass().getSimpleName() + " Name: " + name);
    }

    public ArrayList<Object> minDistance(Charaсter charaсter, ArrayList<Charaсter> team){
        double minDist = 999999999;
        ArrayList<Object> list = new ArrayList<>();
        Charaсter minChar = null;
        for (int i = 0; i < team.size(); i++) {
           if (position.distance(charaсter.x, charaсter.y, team.get(i).x, team.get(i).y) < minDist){
               minDist = position.distance(charaсter.x, charaсter.y, team.get(i).x, team.get(i).y);
               minChar = team.get(i);
           }
        }
        list.add(minDist);
        list.add(minChar);
        return list;
    }


}

