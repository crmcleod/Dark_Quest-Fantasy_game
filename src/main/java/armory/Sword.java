package armory;

import actions.IAttack;

public class Sword extends Armory {

    public Sword(int damageToDeal){
        super(damageToDeal);
    }

    public String canAttack(int data) {
        return "The sword has inflicted " + data + " damage!";
    }
}
