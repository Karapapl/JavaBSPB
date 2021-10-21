package lecture_4_ver_2;

import java.util.Random;

public class FLClientGenerator implements IClientGenerator {

  private static final String[] NamesMale = {
          "Сергей", "Пётр", "Михаил", "Василий", "Дмитрий"
  };

  private static final String[] NamesFemale = {
          "Диана", "Мария", "Виктория", "Ева", "Евгения"
  };

  private static final String[] NextNamesMale = {
          " Петрович", " Георгиевич", " Васильевич", " Михайлович", " Дмитриивич"
  };

  private static final String[] NextNamesFemale = {
          " Петровна", " Георгиевна", " Васильевна", " Михайловна", " Дмитриевна"
  };

  private static final String[] Sex = {
          "Жен.", "Муж."
  };

  @Override
  public Client getRandomClient() {
    FL fl = new FL();
    Random random = new Random();
    fl.setId(random.nextInt(99999));
    if (fl.id % 2 == 0) {
      fl.setSex(Sex[1]);
    } else {
      fl.setSex(Sex[0]);
    }
    if (fl.id % 2 == 0) {
      fl.setName(NamesMale[random.nextInt(NamesMale.length)] + NextNamesMale[random.nextInt(NextNamesMale.length)]);
    } else {
      fl.setName(NamesFemale[random.nextInt(NamesFemale.length)] + NextNamesFemale[random.nextInt(NextNamesFemale.length)]);
    }

    fl.setYear(1900 + random.nextInt(100));
    fl.setInn(607136000 + random.nextInt(9999));
    return fl;
  }
}
