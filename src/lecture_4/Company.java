package lecture_4;

public class Company extends Base {
  String title;
  int ogrn;

  public Company(int id, int inn, String title, int ogrn) {
    super(id, inn);
    this.title = title;
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
