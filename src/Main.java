public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.MELEE, "Lightsaber");
        Boss boss = new Boss("Darth Vader", 500, 60, bossWeapon);

        boss.printInfo();

        Weapon skeletonWeapon = new Weapon(WeaponType.RANGED, "Bow");
        Weapon skeletonSuperWeapon = new Weapon(WeaponType.RANGED, "Super Bow");
        Skeleton skeletonN1 = new Skeleton("Jack", 200, 15, skeletonWeapon, 15);
        Skeleton skeletonN2 = new Skeleton("Mike", 205, 35, skeletonSuperWeapon, 35);

        skeletonN1.printInfo();
        skeletonN2.printInfo();

    }
}