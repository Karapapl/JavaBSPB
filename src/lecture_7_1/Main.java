package lecture_7_1;

public class Main {
  public static void main(String[] args) {
    ObjectsArray arrays = new ObjectsArray();
    System.out.println("Размер массива равен " + arrays.size());
    arrays.add((int) 1);
    arrays.add((String) "1");
    arrays.add((String) "банан");
    arrays.add((int) 2);
    System.out.println("Размер массива равен " + arrays.size());
    arrays.add((String) "3");
    arrays.add((String) "гранат");
    arrays.add((String) "9");
    arrays.add((String) "офис");
    arrays.add((int) 3);
    arrays.add((String) "5");
    System.out.println("Размер массива равен " + arrays.size());
    arrays.add((String) "девять");
    System.out.println("Размер массива до удаления равен " + arrays.size());
    System.out.println("Значение массови под индексом 5 до удаления равно " + arrays.get(5));
    arrays.remove(5);
    System.out.println("Размер массива после удаления равен " + arrays.size());
    System.out.println("Значение массива под индексом 5 после удаления равно " + arrays.get(5));
    arrays.add((String) "ппп");
    arrays.add((String) "ааа");
    arrays.add((String) "рпопго");
    arrays.add((String) "впкеп");
    arrays.add((String) "аппаапап");

    System.out.println("Размер массива равен " + arrays.size());
    System.out.println("Значение массива равно " + arrays.get(5));


  }
}
