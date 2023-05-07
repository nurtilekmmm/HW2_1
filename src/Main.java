public class Main {
    public static void main(String[] args) {
        Magic objectA = new Elemental("Earth Spirit", 100, Element.ЗЕМЛЯ);
        Magic objectB = new FireElemental("Lina", 120);
        Magic objectC = new FireElemental("Ember Spirit", 150);

        System.out.println(objectA.getName() + " имеет " + objectA.getHealth() + " здоровья и элемент " + ((Elemental) objectA).getElement());
        System.out.println(objectB.getName() + " имеет " + objectB.getHealth() + " здоровья и элемент " + ((Elemental) objectB).getElement());
        System.out.println(objectC.getName() + " имеет " + objectC.getHealth() + " здоровья и элемент " + ((Elemental) objectC).getElement());
        System.out.println("----------------");

        ((Elemental) objectA).attack(objectB);
        ((Elemental) objectB).attack(objectA, 25);
        ((Elemental) objectC).attack(objectB);
    }
}