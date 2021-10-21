package lecture_4_ver_2;

import java.util.Comparator;

public class FL extends Client {

  public static Comparator<FL> SortYear = new Comparator<FL>() {
    @Override
    public int compare(FL e1, FL e2) {
      return e1.year - e2.year;
    }
  };
  protected String name;
  protected String sex;
  protected int year;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "FL{" +
            "Id= " + id +
            ", Полное имя= '" + name + '\'' +
            ", Пол= '" + sex + '\'' +
            ", Год рождения= " + year +
            ", ИНН= " + inn +
            '}';
  }
}
