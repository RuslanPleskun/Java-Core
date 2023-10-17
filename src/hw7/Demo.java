package src.hw7;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Hero hero = new Hero("Superman", 100, 7, 0, 1);

        System.out.println("Hero Information:");
        System.out.printf("Name: %s%n", hero.getName());
        System.out.printf("Health: %d%n", hero.getHealth());
        System.out.printf("Strength: %d%n", hero.getStrength());
        System.out.printf("Experience: %d%n", hero.getExperience());
        System.out.printf("Level: %d%n", hero.getLevel());

        Random random = new Random();
        int maxExperience = 100 * hero.getLevel();
        int maxHealth = hero.getLevel() * 50;
        int maxStrength = hero.getLevel() * (random.nextInt(4) + 3);

        for (int battle = 1; battle <= 10; battle++) {
            Enemy enemy = createRandomEnemy(hero);

            System.out.printf("\nBattle %d:%n", battle);
            System.out.println("Enemy Information:");
            System.out.printf("Health: %d%n", enemy.getHealth());
            System.out.printf("Strength: %d%n", enemy.getStrength());
            System.out.printf("Level: %d%n", enemy.getLevel());

            boolean isHeroTurn = random.nextBoolean();

            while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
                if (isHeroTurn) {
                    performHeroTurn(hero, enemy, random);
                    if (enemy.getHealth() <= 0) {
                        handleHeroVictory(hero, enemy, maxExperience, maxHealth, maxStrength, random);
                        break;
                    }
                } else {
                    performEnemyTurn(hero, enemy, random);
                    if (hero.getHealth() <= 0) {
                        handleHeroDefeat();
                        return;
                    }
                }
                isHeroTurn = !isHeroTurn;
            }
        }
    }

    private static Enemy createRandomEnemy(Hero hero) {
        Random random = new Random();
        int enemyHealth = (random.nextInt(101) + 100) * hero.getLevel();
        int enemyStrength = random.nextInt(6) + 3 + (int) (0.1 * hero.getStrength());
        int enemyLevel = random.nextInt(hero.getLevel()) + 1;
        return new Enemy(enemyHealth, enemyStrength, enemyLevel);
    }

    private static void performHeroTurn(Hero hero, Enemy enemy, Random random) {
        if (random.nextInt(10) < 3) {
            int damage = hero.getStrength() + 3;
            enemy.setHealth(enemy.getHealth() - damage);
            System.out.printf("%s deals a critical hit to the enemy for %d damage.%n", hero.getName(), damage);
        } else {
            int damage = hero.getStrength();
            enemy.setHealth(enemy.getHealth() - damage);
            System.out.printf("%s attacks the enemy for %d damage.%n", hero.getName(), damage);
        }
    }

    private static void handleHeroVictory(Hero hero, Enemy enemy, int maxExperience, int maxHealth, int maxStrength, Random random) {
        int extraExperience = 50 * enemy.getLevel();
        hero.setExperience(hero.getExperience() + extraExperience);
        System.out.printf("Enemy defeated! %s gains %d experience points.%n", hero.getName(), extraExperience);

        if (hero.getExperience() >= maxExperience) {
            hero.levelUp();
            maxHealth = hero.getLevel() * 50;
            maxStrength = hero.getLevel() * (random.nextInt(4) + 3);
            hero.setHealth(maxHealth);
            hero.setStrength(maxStrength);
            System.out.printf("%s levels up to level %d. Health and Strength increased.%n", hero.getName(), hero.getLevel());
        }

        int restoreHealth = 100 + (random.nextBoolean() ? 20 : 0);
        hero.setHealth(Math.min(hero.getHealth() + restoreHealth, maxHealth));
        System.out.printf("%s's health restored to %d.%n", hero.getName(), hero.getHealth());
    }

    private static void performEnemyTurn(Hero hero, Enemy enemy, Random random) {
        if (random.nextInt(10) < 1) {
            int damage = enemy.getStrength() + 3;
            hero.setHealth(hero.getHealth() - damage);
            System.out.printf("Enemy deals a critical hit to %s for %d damage.%n", hero.getName(), damage);
        } else {
            int damage = enemy.getStrength();
            hero.setHealth(hero.getHealth() - damage);
            System.out.printf("Enemy attacks %s for %d damage.%n", hero.getName(), damage);
        }
    }

    private static void handleHeroDefeat() {
        System.out.println("Hero has been defeated!");
    }
}
