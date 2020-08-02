package rooms;

import players.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class Room {

    protected Boolean exitIsLocked;
    protected double lightLevel;
    protected ArrayList<Player> players;
    protected ArrayList<Exit> exits;

    public Room(double lightLevel){
        this.exitIsLocked = true;
        this.lightLevel =lightLevel;
        this.players = new ArrayList<Player>();
        this.exits = new ArrayList<Exit>();
    }

    public double getLightLevel() {
        return lightLevel;
    }

    public void setLight(double light) {
        this.lightLevel = light;
    }

    public Boolean checkExit(){
        return this.exitIsLocked;
    }

    public void openExit(){
        this.exitIsLocked = false;
    }

    public void addPlayersToRoom(ArrayList<Player> players){
        this.players = players;
    }
    public void removePlayers(){
        players.clear();
    }

    public int getPlayerCount(){
        return players.size();
    }

    public void generateRandomExits(){
        Random rand = new Random();
        int randExits = rand.nextInt(3);
        for (Exit direction:Exit.values()){
            this.exits.add(direction);
        }
        Collections.shuffle(this.exits);
        this.exits = new ArrayList<Exit>(exits.subList(0, randExits+1));
    }

    public int getExitCount(){
        return this.exits.size();
    }

}
