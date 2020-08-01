package rooms;

import java.util.ArrayList;

public abstract class Room {

    protected Boolean exitIsLocked;

    protected double lightLevel;

    public Room(double lightLevel){
        this.exitIsLocked = true;
        this.lightLevel =lightLevel;
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

}
