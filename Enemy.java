
package game;

public class Enemy {
    
        String name;
    int speed,healthpoint,damage,armor;
    
    void run(){
        System.out.println(name+" is running...");
        System.out.println("Speed: "+speed);
    }
    
    boolean isDead(){
        if(healthpoint <= 0)return true;
        return false;
    }
    void attack(String name) {
        System.out.println(name+" is attacking "+name);
    }
}
