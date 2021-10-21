package lecture_4_ver_2;

public class UL extends Client {

  protected String title;
  protected int ogrn;

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
    return "UL{" +
            "Id= " + id +
            ", Название= '" + title + '\'' +
            ", ИНН= " + inn +
            ", ОГРН= " + ogrn +
            '}';
  }
}
