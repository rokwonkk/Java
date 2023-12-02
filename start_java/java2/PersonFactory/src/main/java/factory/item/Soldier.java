package factory.item;

import factory.bomb.Bomb;
import factory.bomb.Dynamite;
import factory.weapon.Gun;
import factory.weapon.Weapon;

public class Soldier implements Item{
    @Override
    public Weapon createWeapon() {
        return new Gun();
    }
    @Override
    public Bomb createBomb() {
        return new Dynamite();
    }
}
