package lecture_7_2;

public class Main {

  public static void main(String[] args) {
    Dictionary dictionary = new Dictionary();
    dictionary.add(1,"скрипка");
    dictionary.add(2,"гусли");
    dictionary.add("три", "микрофон");
    dictionary.add("четыре","пластинка");
    System.out.println(dictionary.get(2));
    dictionary.add(2, "гитара");
    System.out.println(dictionary.get(2));
    dictionary.remove(2);
    System.out.println(dictionary.get(2));
    dictionary.add(8, "барабаны");
    System.out.println(dictionary.get("четыре"));


  }
}
