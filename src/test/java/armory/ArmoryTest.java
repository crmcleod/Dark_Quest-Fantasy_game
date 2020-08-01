package armory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmoryTest {

    Axe axe;
    Club club;
    Pickaxe pickaxe;
    Sword sword;
    PlateArmour plateArmour;

    @Before
    public void before() {
        axe = new Axe(5);
        club = new Club(10);
        pickaxe = new Pickaxe(10);
        sword = new Sword(10);
        plateArmour = new PlateArmour(2);

    }

    @Test
    public void axeCanDealDamage() {
        assertEquals(5, axe.getDamageToDeal());
    }

    @Test
    public void clubCanDealDamage(){
        assertEquals(10, club.getDamageToDeal());
    }

    @Test
    public void pickAxeCanDealDamage(){
        assertEquals(10, pickaxe.getDamageToDeal());
    }

    @Test
    public void swordCanDealDamage(){
        assertEquals(10, sword.getDamageToDeal());
    }

    @Test
    public void axeCanAttack(){
        int damage = axe.getDamageToDeal();
        assertEquals("The axe has inflicted 5 damage!", axe.canAttack(damage));
    }

    @Test
    public void swordCanAttack(){
        int damage = sword.getDamageToDeal();
        assertEquals("The sword has inflicted 10 damage!", sword.canAttack(damage));
    }

    @Test
    public void clubCanAttack(){
        int damage = club.getDamageToDeal();
        assertEquals("The club has inflicted 10 damage!", club.canAttack(damage));
    }
    @Test
    public void pickAxeCanAttack(){
        assertEquals("The pickaxe has inflicted 10 damage!", pickaxe.canAttack(pickaxe.getDamageToDeal()));
    }

    @Test
    public void armourHasHPincrement(){
        assertEquals(2, plateArmour.getIncreaseHP(),0.1);
    }
}
