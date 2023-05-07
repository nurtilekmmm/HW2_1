    public class Magic {
        private int health;
        private String name;

    public Magic(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
        public void receiveDamage(int damage) {
            int newHealth = health - damage;
            if (newHealth < 0) {
                newHealth = 0;
            }
            health = newHealth;
        }
}
