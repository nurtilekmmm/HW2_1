public class Elemental extends Magic {
    private Element element;

    public Elemental(String name, int health, Element element) {
        super(name, health);
        this.element = element;
    }

    public Element getElement() {
        return element;
    }

    // перегруженный метод
    public void attack(Magic target) {
        System.out.println(getName() + " атакует  " + target.getName() + " с элементом " + element);
    }

    // перегруженный неперезаписываемый метод
    public final void attack(Magic target, int damage) {
        target.receiveDamage(damage);
        System.out.println(getName() + " атакует " + target.getName() + " с элементом " + element + " на " + damage + " урона");
    }
}
