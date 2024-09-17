public class Skeleton extends Boss {
    private int ammoCount;

    public Skeleton(String name, int health, int damage, Weapon weapon, int ammoCount) {
        super(name, health, damage, weapon);
        this.ammoCount = ammoCount;
    }



    public int getAmmoCount() {
        return ammoCount;
    }

    public void setAmmoCount(int ammoCount) {
        this.ammoCount = ammoCount;
    }


    @Override
    public void printInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println("Weapon: " + getWeapon().getName() + " (" + getWeapon().getType() + ")");
        System.out.println("Ammo count: " + getAmmoCount());
    }
}
