public class Jaeger {
    private String mark;
    private String origin;
    private int height;
    private int weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String mark, String origin,
            int height, int weight, int speed, int strength, int armor) {
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void walk() {
        System.out.println(mark + ": Продвижение на " + speed * 100 + " метров");
    }

    public void attack() {
        System.out.println(mark + ": Нанесено " + strength + " урона");
    }

    public void defence() {
        System.out.println(mark + ": Защита повышена на " + armor);
    }
}