package src.hw7;

public class Enemy {
    private int health;
    private int strength;
    private int level;

    public Enemy(int health, int strength, int level) {
        this.health = health;
        this.strength = strength;
        this.level = level;
    }

    public Enemy() {
        this.health = 150;
        this.strength = 4;
        this.level = 1;
    }

    public void attack(Hero hero) {
        int damage = this.strength;
        hero.attack(this);
        System.out.println("Enemy attacks " + hero.getName() + " for " + damage + " damage.");
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLevel() {
        return level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
