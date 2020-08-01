package rooms;

import enemies.Enemy;

import java.util.ArrayList;

public class EnemyRoom extends Room{

    private ArrayList<Enemy> enemies;

    public EnemyRoom(double lightLevel){
        super(lightLevel);
        this.enemies = new ArrayList<Enemy>();
    }

    public void addEnemyToRoom(Enemy enemy){
        this.enemies.add(enemy);
    }

    public int countEnemies(){
        return this.enemies.size();
    }

    public Boolean checkAllEnemiesDead(){
        boolean allEnemiesDead = false;
        for (Enemy enemy: enemies){
            if (enemy.checkHealth() <= 0){
                allEnemiesDead = true;
            }
        }
        return allEnemiesDead;

    }

    public Enemy getEnemyByIndex(int index){
        return enemies.get(index);
    }

}
