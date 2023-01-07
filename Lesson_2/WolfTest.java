public class WolfTest {
    public static void main(String args[]) {
      Wolf wolfOne = new Wolf();
      wolfOne.sex = "Мужской";
      wolfOne.name = "Белый клык";
      wolfOne.height = 100;
      wolfOne.weight = 50; 
      wolfOne.age = 5;
      wolfOne.color = "Белый";
      
      System.out.println("Пол: " + wolfOne.sex);
      System.out.println("Имя: " + wolfOne.name);
      System.out.println("Рост: " + wolfOne.height);
      System.out.println("Вес: " + wolfOne.weight);
      System.out.println("Возраст: " + wolfOne.age);
      System.out.println("Окрас: " + wolfOne.color + "\n");
      
      wolfOne.walk();
      wolfOne.sit();
      wolfOne.run();
      wolfOne.howl();
      wolfOne.hunt();
    }
}
