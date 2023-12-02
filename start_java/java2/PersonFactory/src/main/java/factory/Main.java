package factory;

import factory.item.Soldier;
import factory.item.Warrior;

public class Main {
    public static void main(String[] args) {

        //person을 생성
        Person person1 = new Person();
        //person원은 솔져주입
        person1.create(new Soldier());

        person1.m_weapon.DrawWeapon();
        person1.m_bomb.DrawBomb();

        Person person2 = new Person();
        person2.create(new Warrior());

        person2.m_weapon.DrawWeapon();
        person2.m_bomb.DrawBomb();

    }
}