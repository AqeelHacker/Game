
package game;

public class Game {

    public static void main(String[] args) {
        Player hero = new Player();
        Enemy enemy = new Enemy();
        
        hero.name = "Saitama";
        hero.speed = 500;
        hero.healthpoint = 100;
        hero.armor = 100;
        hero.damage = 100;
        
        enemy.name = "Garou";
        enemy.speed = 100;
        enemy.healthpoint = 100;
        enemy.armor = 100;
        enemy.damage = 50;
        
        enemy.run();
        enemy.attack(enemy.name);
        
        if(enemy.isDead()){
            System.out.println("Game Over!!!");
        }
        hero.run();
        hero.attack(enemy.name);
        
        if(hero.isDead()){
            System.out.println("Game Over!!!");
        }

    }
    
}
