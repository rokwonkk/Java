package factory.item;

import factory.bomb.Bomb;
import factory.bomb.C4;
import factory.weapon.Sword;
import factory.weapon.Weapon;

public class Warrior implements Item{

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Bomb createBomb() {
        return new C4();
    }
}
