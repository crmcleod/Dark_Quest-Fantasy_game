package armory;

import actions.IAttack;

public class Axe extends Armory {
    public Axe(int damageToDeal){
        super(damageToDeal);
    }

    public String canAttack(int data) {
        return "The axe has inflicted " + data + " damage!";
    }

}
