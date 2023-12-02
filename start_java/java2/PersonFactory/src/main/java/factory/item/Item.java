package factory.item;

import factory.bomb.Bomb;
import factory.weapon.Weapon;

public interface Item {

    Weapon createWeapon();

    Bomb createBomb();

}
