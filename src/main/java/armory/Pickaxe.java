package armory;

public class Pickaxe extends Armory{
    public Pickaxe(int damageToDeal){
        super(damageToDeal);
    }

    public String canAttack(int data) {
        return "The pickaxe has inflicted " + data + " damage!";
    }

}
