package spells;

import actions.IProtect;
import players.Player;

public class Ogre implements IProtect {
    private int protectionLevel;

    public Ogre(int protectionLevel){
        this.protectionLevel = protectionLevel;
    }

    public void protect(Player player){
        player.addProtection(protectionLevel);
    }
}
