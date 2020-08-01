package spells;

import actions.IProtect;
import players.Player;

public class Dragon implements IProtect {

    private int protectionLevel;

    public Dragon(int protectionLevel){
        this.protectionLevel = protectionLevel;
    }

    public void protect(Player player){
        player.addProtection(protectionLevel);
    }

}
