package armory;

public class Club extends Armory{

    public Club(int damageToDeal){
        super(damageToDeal);
    }

    public String canAttack(int data) {
        return "The club has inflicted " + data + " damage!";
    }
}
