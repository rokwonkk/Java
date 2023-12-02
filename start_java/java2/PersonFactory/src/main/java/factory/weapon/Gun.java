package factory.weapon;

public class Gun implements Weapon{

    @Override
    public void DrawWeapon() {
        System.out.println("weapon : 총");
    }
}
