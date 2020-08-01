package rooms;

import players.Player;

import java.util.ArrayList;

public abstract class Room {

    protected Boolean exitIsLocked;
    protected double lightLevel;
    protected ArrayList<Player> players;

    public Room(double lightLevel){
        this.exitIsLocked = true;
        this.lightLevel =lightLevel;
        this.players = new ArrayList<Player>();
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

}
