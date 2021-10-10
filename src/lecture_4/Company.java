package lecture_4;

public class Company extends Base {
  String title;
  int ogrn;

  public Company(int id, int inn, String title, int ogrn) {
    this.id = id;
    this.inn = inn;
    this.title = title;
    this.ogrn = ogrn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getOgrn() {
    return ogrn;
  }

  public void setOgrn(int ogrn) {
    this.ogrn = ogrn;
  }

  @Override
  public String toString() {
    return "Company{" +
            "id=" + id +
            ", inn=" + inn +
            ", title='" + title + '\'' +
            ", ogrn=" + ogrn +
            '}';
  }

}
