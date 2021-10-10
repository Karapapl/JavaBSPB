package lecture_4;

import java.util.Comparator;

public class Individual extends Base {
  //Сортировка по году
  public static Comparator<Individual> SortYear = new Comparator<Individual>() {
    @Override
    public int compare(Individual e1, Individual e2) {
      return e1.year - e2.year;
    }
  };

  String fullName;
  int year;
  String sex;

  public Individual(int id, String fullName, int year, String sex, int inn) {
    this.id = id;
    this.inn = inn;
    this.fullName = fullName;
    this.year = year;
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "ФЛ{" +
            "id: " + id +
            ", ИНН: " + inn +
            ", ФИО: '" + fullName + '\'' +
            ", год рождения: " + year +
            ", пол: '" + sex + '\'' +
            '}';
  }

}

