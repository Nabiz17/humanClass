package classHuman;

public class Human {
  //Создайте класс "Человек", конструктор которого принимает имя.
  //
  //При попытке вывести объект этого класса на экран должна выводиться строка "Человек по имени ...".
  //
  //Добавьте в класс "Человек" метод "приветствие", который будет выводить строку: "Я родился!"
  //
  //Создайте классы "Мужчина" и "Женщина", которые будут наследниками класса "Человек".
  //
  //Попытка вывести их на экран должна приводить к выводу строки "Мужчина по имени ..."
  // или "Женщина по имени ..."
  //
  //Метод "приветствие" класса "Женщина" должен выводить строку: "Я родилась!"

 private String name;

  public Human(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  //public class StringNameOut {
  //    public static void main(String[] args) {
  //        Human max = new Human("Макс");
  //        String out = "Java объект: " + max;
  //        System.out.println(out);
  //        // Вывод: Java объект: Человек с именем Макс
  //    }

  public void humanGreat() {
    System.out.println("Я родился!");
  }

  @Override
  public String toString() {
    return "Человек по имени " + name;
  }
}




