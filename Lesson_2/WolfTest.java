public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setSex("Мужской");
        wolf.setName("Белый клык");
        wolf.setHeight(100);
        wolf.setWeight(50);
        wolf.setAge(5);
        wolf.setColor("Белый");

        System.out.println("Пол: " + wolf.getSex());
        System.out.println("Имя: " + wolf.getName());
        System.out.println("Рост: " + wolf.getHeight());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());
        System.out.println("Окрас: " + wolf.getColor() + "\n");

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}