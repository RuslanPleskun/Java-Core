package src.hw7;

public class Hero {
    private String name;
    private int health;
    private int strength;
    private int experience;
    private int level;

    public Hero(String name, int health, int strength, int experience, int level) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.experience = experience;
        this.level = level;
    }

    public Hero() {
        this.name = "DefaultHero";
        this.health = 100;
        this.strength = 7;
        this.experience = 0;
        this.level = 1;
    }

    public void attack(Enemy enemy) {
        int damage = this.strength;
        enemy.attack(this);
        System.out.println(this.name + " attacks for " + damage + " damage.");
    }

    public void avoid() {
        System.out.println(this.name + " avoids the enemy.");
    }

    public void levelUp() {
        this.level++;
        System.out.println(this.name + " levels up to level " + this.level);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
