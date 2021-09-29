package lecture_2;

import java.util.Arrays;

public class HomeWork {
  public static void main(String[] args) {

    String[][] person = {
            {"Симпсон Гомер Абрахамович", "M", "38"},
            {"Санчез Рик Неизвестнович", "M", "70"},
            {"Арагорн Сын Араторна", "M", "210"},
            {"Керри Энн Мосс", "F", "54"},
            {"Уик Джон Кианович", "M", "57"},
            {"Стейси Гвендолин Робертовна", "F", "18"},
            {"Уэйн Брюс Томасович", "M", "30"},
            {"Йоханссон Скарлетт Карстеновна", "F", "36"},
            {"Хоулетт Джеймс Логонович", "F", "197"},
            {"Мохийам Елена Гайявна", "F", "48"}};

    String[] min;
    for (int i = 0; i < person.length; i++) {
      for (int j = i + 1; j < person.length; j++) {
        if (Integer.parseInt(person[i][2]) > Integer.parseInt(person[j][2])) {
          min = person[i];
          person[i] = person[j];
          person[j] = min;
        }
      }
    }

    for (int i = 0; i < person.length; i++) {
      if (person[i][1] == "M") {
        System.out.println(Arrays.toString(person[i]));
      }
    }
  }

}








