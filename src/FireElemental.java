final class FireElemental extends Elemental {
    public FireElemental(String name, int health) {
        super(name, health, Element.ОГОНЬ);
    }

    @Override
    public void attack(Magic target) {
        System.out.println(getName() + " стреляет огнем на " + target.getName());
        super.attack(target);
    }
}
