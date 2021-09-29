package lecture_4;

public class Base {
  int id;
  int inn;

  public Base(int id, int inn) {
    this.id = id;
    this.inn = inn;
  }

  @Override
  public String toString() {
    return "Base{" +
            "id=" + id +
            ", inn=" + inn +
            '}';
  }


}
