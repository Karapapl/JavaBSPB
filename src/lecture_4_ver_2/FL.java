package lecture_4_ver_2;

import java.util.Comparator;

public class FL extends Client{

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

  public static Comparator<FL> yearSort = new Comparator<FL>() {
    @Override
    public int compare(FL o1, FL o2) {
      int FlYear1 = o1.year;
      int FlYear2 = o2.year;
      return FlYear1 - FlYear2;
    }
  };



}
